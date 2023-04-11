package com.example.postOffice.controllers;

import com.example.postOffice.models.Company;
import com.example.postOffice.repository.CompaniesRepository;
import com.example.postOffice.services.CompaniesService;
import com.example.postOffice.services.UsersService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
class CompaniesController {
    private final CompaniesService service;
    CompaniesController(CompaniesService service) {
        this.service = service;
    }

    @GetMapping("/companies")
    List<Company> all() {
        List<Company> companies= service.getAllCompanies();
        return companies;
    }
}
