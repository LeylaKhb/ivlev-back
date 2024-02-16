package ivlev.ivlevback.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ivlev.ivlevback.models.Person;
import ivlev.ivlevback.service.RegistrationService;
import ivlev.ivlevback.validator.PersonValidator;

@Controller
public class PeopleController {
    private final RegistrationService registrationService;
    private final PersonValidator personValidator;

    @Autowired
    public PeopleController(RegistrationService registrationService, PersonValidator personValidator) {
        this.registrationService = registrationService;
        this.personValidator = personValidator;
    }

    @PostMapping("/registration")
    public String registration(@ModelAttribute("person") Person person,
                               BindingResult bindingResult) {
        personValidator.validate(person, bindingResult);

        if (bindingResult.hasErrors())
            return "/registration";

        registrationService.register(person);

        return "redirect:/personal_account";
    }
}
