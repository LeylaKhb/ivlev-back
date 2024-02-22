package ivlev.ivlevback.controllers;

import ivlev.ivlevback.config.ResponseBody;
import ivlev.ivlevback.dto.AuthenticationDTO;
import ivlev.ivlevback.dto.PersonDTO;
import ivlev.ivlevback.security.PersonDetails;
import ivlev.ivlevback.utils.JWTUtil;
import ivlev.ivlevback.utils.PasswordService;
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

@RestController
public class PeopleController {
    private final RegistrationService registrationService;
    private final PersonValidator personValidator;
    private final JWTUtil jwtUtil;
    private final ModelMapper modelMapper;
    private final AuthenticationManager authenticationManager;
    private final PasswordService passwordUtil;

    @Autowired
    public PeopleController(RegistrationService registrationService, PersonValidator personValidator, JWTUtil jwtUtil,
                            ModelMapper modelMapper, AuthenticationManager authenticationManager, PasswordService passwordUtil) {
        this.registrationService = registrationService;
        this.personValidator = personValidator;
        this.jwtUtil = jwtUtil;
        this.modelMapper = modelMapper;
        this.authenticationManager = authenticationManager;
        this.passwordUtil = passwordUtil;
    }

    @PostMapping("/registration")
    public ResponseBody registration(@RequestBody PersonDTO personDTO,
                                     BindingResult bindingResult,
                                     HttpServletResponse httpServletResponse) {
        Person person = convertToPerson(personDTO);
        personValidator.validate(person, bindingResult);

        if (bindingResult.hasErrors())
            return new ResponseBody("error", "Пользователь с такой почтой уже существует");


        registrationService.register(person);
        String token = jwtUtil.generateToken(person.getEmail());

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


        if (!(passwordUtil.compare(oldPassword, personDetails.getPassword()))) {
            return new ResponseBody("error", "Неверный пароль");
        }
        passwordUtil.update(personDetails, newPassword);
        return new ResponseBody("ok", newPassword);
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
                authenticationDTO.getEmail(),
                authenticationDTO.getPassword());

        try {
            authenticationManager.authenticate(authInputToken);
        } catch (BadCredentialsException ex) {
            return new ResponseBody("error", "Неверно указана почта или пароль");
        }

        String token = jwtUtil.generateToken(authenticationDTO.getEmail());
        createCookie(token, httpServletResponse);
        return new ResponseBody("jwt", token);

    }

    private Person convertToPerson(PersonDTO personDTO) {
        return modelMapper.map(personDTO, Person.class);
    }


    @GetMapping("/personal_account")
    public Person personalAccount() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        PersonDetails personDetails = (PersonDetails) authentication.getPrincipal();

        return personDetails.getPerson();
    }
}
