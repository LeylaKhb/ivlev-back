package ivlev.ivlevback.repositories;

import ivlev.ivlevback.models.Company;
import ivlev.ivlevback.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompaniesRepository extends JpaRepository<Company, Long> {
    List<Company> getAllByPerson(Person person);
}
