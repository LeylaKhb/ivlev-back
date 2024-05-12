package ivlev.ivlevback.service;

import ivlev.ivlevback.models.Person;
import ivlev.ivlevback.models.Role;
import ivlev.ivlevback.repositories.PeopleRepository;
import ivlev.ivlevback.security.PersonDetails;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private final PeopleRepository peopleRepository;

    public PersonService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    public void update(PersonDetails personDetails, Person personNew) {
        Person person = personDetails.getPerson();
        person.setName(personNew.getName());
        person.setEmail(personNew.getEmail().toLowerCase());
        peopleRepository.save(person);
    }

    public Person getAdmin() {
        return peopleRepository.findByRole(Role.ROLE_ADMIN);
    }
}
