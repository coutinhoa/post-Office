package com.example.postOffice.services;

import com.example.postOffice.models.Country;
import com.example.postOffice.repository.CountriesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
