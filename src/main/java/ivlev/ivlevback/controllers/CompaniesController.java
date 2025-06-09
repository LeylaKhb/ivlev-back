package ivlev.ivlevback.controllers;

import ivlev.ivlevback.dto.CompanyDTO;
import ivlev.ivlevback.models.Company;
import ivlev.ivlevback.security.PersonDetails;
import ivlev.ivlevback.service.CompaniesService;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/companies")
public class CompaniesController {
    private final CompaniesService companiesService;

    public CompaniesController(CompaniesService companiesService) {
        this.companiesService = companiesService;
    }

    @GetMapping
    public List<String> getCompanies() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        PersonDetails personDetails = (PersonDetails) authentication.getPrincipal();

        return companiesService.getAllByPerson(personDetails.getPerson());
    }

    @PostMapping("/add")
    public void addNewCompany(@RequestBody CompanyDTO companyDTO) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        PersonDetails personDetails = (PersonDetails) authentication.getPrincipal();

        companiesService.addNewOrder(companyDTO, personDetails.getPerson());
    }

    @PostMapping("/delete/{inn}")
    public void deleteCompany(@PathVariable("inn") String inn, Authentication authentication) {
        PersonDetails personDetails = (PersonDetails) authentication.getPrincipal();

        companiesService.deleteOrder(inn, personDetails.getPerson());
    }
}
