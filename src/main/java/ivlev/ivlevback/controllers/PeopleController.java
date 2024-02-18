package ivlev.ivlevback.controllers;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import ivlev.ivlevback.models.Person;
import ivlev.ivlevback.service.RegistrationService;
import ivlev.ivlevback.validator.PersonValidator;

@RestController
public class PeopleController {
    private final RegistrationService registrationService;
    private final PersonValidator personValidator;

    @Autowired
    public PeopleController(RegistrationService registrationService, PersonValidator personValidator) {
        this.registrationService = registrationService;
        this.personValidator = personValidator;
    }

    @CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
    @PostMapping("/registration")
    public Person registration(@RequestBody Person person,
                               BindingResult bindingResult,
                               HttpServletResponse httpServletResponse) {
        System.out.println(person);
        personValidator.validate(person, bindingResult);

//        if (bindingResult.hasErrors())
//            return ;


        registrationService.register(person);

        return person;
    }

    @GetMapping("/")
    public String hello() {
        return "Hello";
    }
}
