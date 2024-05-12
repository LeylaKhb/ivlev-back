package ivlev.ivlevback.repositories;

import ivlev.ivlevback.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ivlev.ivlevback.models.Person;
import java.util.Optional;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Long> {
    Optional<Person> findByEmail(String email);
    Person findByRole(Role role);
}
