package postoffice.services;
import postoffice.models.Company;
import postoffice.repository.CompaniesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompaniesService {
    private final CompaniesRepository repository;
    CompaniesService(CompaniesRepository repository) {
        this.repository = repository;
    }

    public List<Company> getAllCompanies(){
        return repository.findAll();
    }
}
