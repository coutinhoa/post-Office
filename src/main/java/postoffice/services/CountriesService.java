package postoffice.services;

import postoffice.models.Country;
import postoffice.repository.CountriesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountriesService {
    private final CountriesRepository repository;

    CountriesService(CountriesRepository repository) {
        this.repository = repository;
    }
    public List<Country> getAllCountries(){
        return repository.findAll();
    }



}
