package ivlev.ivlevback.controllers;

import freemarker.template.TemplateException;
import ivlev.ivlevback.aspect.annotation.NewUserLogging;
import ivlev.ivlevback.config.ResponseBody;
import ivlev.ivlevback.dto.AuthenticationDTO;
import ivlev.ivlevback.dto.PersonDTO;
import ivlev.ivlevback.security.PersonDetails;
import ivlev.ivlevback.service.EmailServices;
import ivlev.ivlevback.service.PersonService;
import ivlev.ivlevback.utils.JWTUtil;
import ivlev.ivlevback.service.PasswordService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import ivlev.ivlevback.models.Person;
import ivlev.ivlevback.service.RegistrationService;
import ivlev.ivlevback.validator.PersonValidator;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

@RestController
public class PeopleController {
    private final RegistrationService registrationService;
    private final PersonValidator personValidator;
    private final JWTUtil jwtUtil;
    private final ModelMapper modelMapper;
    private final AuthenticationManager authenticationManager;
    private final PasswordService passwordService;
    private final PersonService personService;
    private final EmailServices emailService;

    @Autowired
    public PeopleController(RegistrationService registrationService, PersonValidator personValidator, JWTUtil jwtUtil,
                            ModelMapper modelMapper, AuthenticationManager authenticationManager, PasswordService passwordService,
                            PersonService personService, EmailServices emailService) {
        this.registrationService = registrationService;
        this.personValidator = personValidator;
        this.jwtUtil = jwtUtil;
        this.modelMapper = modelMapper;
        this.authenticationManager = authenticationManager;
        this.passwordService = passwordService;
        this.personService = personService;
        this.emailService = emailService;
    }

    @NewUserLogging
    @PostMapping("/registration")
    public ResponseBody registration(@RequestBody PersonDTO personDTO,
                                     BindingResult bindingResult,
                                     HttpServletResponse httpServletResponse) {
        Person person = convertToPerson(personDTO);
        person.setEmail(person.getEmail().toLowerCase());
        personValidator.validate(person, bindingResult);

        if (bindingResult.hasErrors())
            return new ResponseBody("error", "Пользователь с такой почтой уже существует");


        registrationService.register(person);
        String token = jwtUtil.generateToken(person.getEmail().toLowerCase());

        createCookie(token, httpServletResponse);

        return new ResponseBody("jwt", token);
    }

    @PostMapping("/change_password")
    public ResponseBody changePassword(@RequestBody String jsonString) throws ParseException {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        PersonDetails personDetails = (PersonDetails) authentication.getPrincipal();

        Object obj = new JSONParser().parse(jsonString);
        JSONObject jo = (JSONObject) obj;
        String oldPassword = (String) jo.get("old");
        String newPassword = (String) jo.get("new");


        if (!(passwordService.compare(oldPassword, personDetails.getPassword()))) {
            return new ResponseBody("error", "Неверный пароль");
        }
        passwordService.update(personDetails, newPassword);
        return new ResponseBody("ok", newPassword);
    }

    @PostMapping("/new_password")
    public ResponseBody setNewPassword(@RequestBody AuthenticationDTO authenticationDTO) throws ParseException {
        passwordService.updatePassword(authenticationDTO);
        return new ResponseBody("ok", "");
    }

    @PostMapping("/logout")
    public String performLogout() {
        SecurityContextHolder.getContext().setAuthentication(null);
        return "ok";
    }

    @PostMapping("/change_person")
    public ResponseBody changePerson(@RequestBody PersonDTO personDTO, BindingResult bindingResult) throws ParseException {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        PersonDetails personDetails = (PersonDetails) authentication.getPrincipal();

        Person person = convertToPerson(personDTO);
        person.setEmail(person.getEmail().toLowerCase());
        if (!(personDetails.getUsername().equals(person.getEmail())))
            personValidator.validate(person, bindingResult);

        if (bindingResult.hasErrors())
            return new ResponseBody("error", "Пользователь с такой почтой уже существует");

        personService.update(personDetails, person);
        String token = jwtUtil.generateToken(person.getEmail());
        return new ResponseBody("jwt", token);
    }


    private void createCookie(String token, HttpServletResponse httpServletResponse) {
        Cookie cookie = new Cookie("jwt", token);
        cookie.setHttpOnly(true);
        cookie.setSecure(true);
        cookie.setMaxAge(2147483647);
        cookie.setPath("/");
        cookie.setDomain("localhost");
        httpServletResponse.addCookie(cookie);
    }

    @PostMapping("/login")
    public ResponseBody login(@RequestBody AuthenticationDTO authenticationDTO,
                              HttpServletResponse httpServletResponse) {
        UsernamePasswordAuthenticationToken authInputToken = new UsernamePasswordAuthenticationToken(
                authenticationDTO.getEmail().toLowerCase(),
                authenticationDTO.getPassword());

        try {
            authenticationManager.authenticate(authInputToken);
        } catch (BadCredentialsException ex) {
            return new ResponseBody("error", "Неверно указана почта или пароль");
        }

        String token = jwtUtil.generateToken(authenticationDTO.getEmail().toLowerCase());
        createCookie(token, httpServletResponse);

        if (personService.checkAdmin(authenticationDTO.getEmail())) {
            return new ResponseBody("jwt", token + "*true");
        }
        return new ResponseBody("jwt", token);

    }

    private Person convertToPerson(PersonDTO personDTO) {
        return modelMapper.map(personDTO, Person.class);
    }


    @GetMapping("/personal_account")
    public Person personalAccount() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        PersonDetails personDetails = null;
        try {
            personDetails = (PersonDetails) authentication.getPrincipal();
        } catch (ClassCastException ignored) {
        }
        assert personDetails != null;
        return personDetails.getPerson();
    }

    @PostMapping("/recover_password")
    public ResponseBody recoverPassword(@RequestBody PersonDTO personDTO,
                                     BindingResult bindingResult) throws TemplateException, IOException {
        personDTO.setEmail(personDTO.getEmail().toLowerCase());
        String email = personDTO.getEmail();

        personValidator.validate(convertToPerson(personDTO), bindingResult);

        if (!(bindingResult.hasErrors()))
            return new ResponseBody("error", "Пользователя с такой почтой не существует");

        String temporalPassword = emailService.sendEmail(email);

        return new ResponseBody("password", temporalPassword);
    }
}
