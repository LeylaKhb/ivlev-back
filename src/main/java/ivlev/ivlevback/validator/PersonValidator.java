package ivlev.ivlevback.validator;

import ivlev.ivlevback.models.Person;
import ivlev.ivlevback.service.PersonDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class PersonValidator implements Validator {
    private PersonDetailsService personDetailsService;

    public PersonValidator(PersonDetailsService personDetailsService) {
        this.personDetailsService = personDetailsService;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.equals(Person.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Person person = (Person) target;

        try {
            personDetailsService.loadUserByUsername(person.getEmail());
        } catch (UsernameNotFoundException ignored) {
            return; // все ок, пользователь не найден
        }

        errors.rejectValue("email", "", "Человек с такой почтой уже зарегистрирован");
    }
}
