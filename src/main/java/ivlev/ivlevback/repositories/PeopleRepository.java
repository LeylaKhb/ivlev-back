package ivlev.ivlevback.repositories;

import ivlev.ivlevback.models.Orders;
import ivlev.ivlevback.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ivlev.ivlevback.models.Person;

import java.util.List;
import java.util.Optional;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Long> {
    Optional<Person> findByEmail(String email);
    Person findByRole(Role role);
    @Query(value = "SELECT * FROM person p WHERE :email = '' or p.email like %:email%",
            nativeQuery = true)
    List<Person> findForAdmin(@Param("email") String email);
}
