package ivlev.ivlevback.service;

import ivlev.ivlevback.dto.CompanyDTO;
import ivlev.ivlevback.models.Company;
import ivlev.ivlevback.models.Person;
import ivlev.ivlevback.repositories.CompaniesRepository;
import jakarta.transaction.Transactional;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompaniesService {
    private final CompaniesRepository companiesRepository;

    public CompaniesService(CompaniesRepository companiesRepository) {
        this.companiesRepository = companiesRepository;
    }

    public List<String> getAllByPerson(Person person) {
        return companiesRepository.getAllByPerson(person).stream()
                .map(c -> String.format("%s (%s)", c.getCompanyName(), c.getInn()))
                .toList();
    }

    public void addNewOrder(CompanyDTO companyDTO, Person person) {
        companiesRepository.save(new Company(companyDTO.getCompanyName(), companyDTO.getInn(), person));
    }

    @Transactional
    public void deleteOrder(String inn, Person person) {
        Optional<Company> companyOpt = companiesRepository.findByInn(inn);

        if (companyOpt.isPresent() && person.getCompanies().stream().anyMatch(comp -> comp.getInn().equals(inn))) {
            companiesRepository.delete(companyOpt.get());
            return;
        }
        throw new AccessDeniedException("Нет доступа к этой компании");
    }

}
