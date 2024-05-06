package ivlev.ivlevback.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import ivlev.ivlevback.models.Person;
import ivlev.ivlevback.repositories.PeopleRepository;

@Service
public class RegistrationService {

    private final PasswordEncoder passwordEncoder;
    private final PeopleRepository peopleRepository;
    private final PersonDetailsService personDetailsService;

    @Autowired
    public RegistrationService(PasswordEncoder passwordEncoder, PeopleRepository peopleRepository, PersonDetailsService personDetailsService) {
        this.passwordEncoder = passwordEncoder;
        this.peopleRepository = peopleRepository;
        this.personDetailsService = personDetailsService;
    }

    @Transactional
    public void register(Person p) {
        try {
            personDetailsService.loadUserByUsername(p.getEmail());
        } catch (UsernameNotFoundException ex) {
        }
        p.setPassword(passwordEncoder.encode(p.getPassword()));
        p.setRole("ROLE_USER");
        p.setPhoto("http://res.cloudinary.com/dphkmjgiy/image/upload/v1708548020/requwfo8zjwfdftelf6v.png");
        peopleRepository.save(p);
    }
}
