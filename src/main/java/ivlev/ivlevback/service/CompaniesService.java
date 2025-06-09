package ivlev.ivlevback.service;

import ivlev.ivlevback.dto.CompanyDTO;
import ivlev.ivlevback.models.Company;
import ivlev.ivlevback.models.Person;
import ivlev.ivlevback.repositories.CompaniesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
