package com.example.postOffice.services;
import com.example.postOffice.models.Company;
import com.example.postOffice.repository.CompaniesRepository;
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
