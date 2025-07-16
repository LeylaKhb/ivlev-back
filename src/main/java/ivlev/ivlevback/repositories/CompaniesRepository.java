package ivlev.ivlevback.repositories;

import ivlev.ivlevback.models.Company;
import ivlev.ivlevback.models.Person;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CompaniesRepository extends JpaRepository<Company, Long> {
    List<Company> getAllByPerson(Person person);

    Optional<Company> findByInnAndAndPerson(String inn, Person person);

    boolean existsByInnAndPerson(String inn, Person person);
}
