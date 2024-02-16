package ivlev.ivlevback.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import ivlev.ivlevback.models.Person;
import ivlev.ivlevback.repositories.PeopleRepository;
import ivlev.ivlevback.security.PersonDetails;
import java.util.Optional;

@Service
public class PersonDetailsService implements UserDetailsService {
    private PeopleRepository peopleRepository;
    private PersonDetails personDetails;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Person> person = peopleRepository.findByEmail(username);

        if (person.isEmpty()) {
            throw new UsernameNotFoundException("User not found");
        }
        return new PersonDetails(person.get());

    }
}
