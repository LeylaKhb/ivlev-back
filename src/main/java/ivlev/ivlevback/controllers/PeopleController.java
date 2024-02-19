package ivlev.ivlevback.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import ivlev.ivlevback.dto.PersonDTO;
import ivlev.ivlevback.service.JWTUtil;
import jakarta.servlet.http.HttpServletResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import ivlev.ivlevback.models.Person;
import ivlev.ivlevback.service.RegistrationService;
import ivlev.ivlevback.validator.PersonValidator;

import java.util.Map;

@RestController
public class PeopleController {
    private final RegistrationService registrationService;
    private final PersonValidator personValidator;

    private final JWTUtil jwtUtil;
    private final ModelMapper modelMapper;

    @Autowired
    public PeopleController(RegistrationService registrationService, PersonValidator personValidator, JWTUtil jwtUtil, ModelMapper modelMapper) {
        this.registrationService = registrationService;
        this.personValidator = personValidator;
        this.jwtUtil = jwtUtil;
        this.modelMapper = modelMapper;
    }

//    @CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
    @PostMapping("/registration")
    public String registration(@RequestBody PersonDTO personDTO,
                               BindingResult bindingResult,
                               HttpServletResponse httpServletResponse) {
        Person person = convertToPerson(personDTO);
        System.out.println(person);
        personValidator.validate(person, bindingResult);

        if (bindingResult.hasErrors())
            return "Пользователь с такой почтой уже существует";


        registrationService.register(person);
        String token = jwtUtil.generateToken(person.getEmail());
        return token;

    }

    private Person convertToPerson(PersonDTO personDTO) {
        return modelMapper.map(personDTO, Person.class);
    }

    @GetMapping("/")
    public String hello() {
        return "Hello";
    }
}
