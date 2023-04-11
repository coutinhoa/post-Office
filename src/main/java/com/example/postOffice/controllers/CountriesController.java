package com.example.postOffice.controllers;

import com.example.postOffice.models.Country;
import com.example.postOffice.models.User;
import com.example.postOffice.services.CountriesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8888", methods={RequestMethod.GET})
@RestController
class CountriesController {

    private final CountriesService service;
    CountriesController(CountriesService service) {
        this.service = service;
    }

    @GetMapping("/countries")
    List<Country> all() {
        List<Country> countries= service.getAllCountries();
        return countries;
    }


}
