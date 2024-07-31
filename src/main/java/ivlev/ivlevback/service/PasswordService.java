package ivlev.ivlevback.service;

import ivlev.ivlevback.dto.AuthenticationDTO;
import ivlev.ivlevback.models.Person;
import ivlev.ivlevback.repositories.PeopleRepository;
import ivlev.ivlevback.security.PersonDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PasswordService {
    private final PasswordEncoder passwordEncoder;
    private final PeopleRepository peopleRepository;


    public PasswordService(PasswordEncoder passwordEncoder, PeopleRepository peopleRepository) {
        this.passwordEncoder = passwordEncoder;
        this.peopleRepository = peopleRepository;
    }

    public boolean compare(String inputPassword, String userPassword) {
        return passwordEncoder.matches(inputPassword, userPassword);
    }

    public void update(PersonDetails personDetails, String password) {
        Person person = personDetails.getPerson();
        person.setPassword(passwordEncoder.encode(password));
        peopleRepository.save(person);
    }

    public void updatePassword(AuthenticationDTO authenticationDTO) {
        Person person = peopleRepository.findByEmail(authenticationDTO.getEmail().toLowerCase()).get();
        person.setPassword(passwordEncoder.encode(authenticationDTO.getPassword()));
        peopleRepository.save(person);
    }
}
