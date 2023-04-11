package postoffice.controllers;

import postoffice.models.Country;
import postoffice.services.CountriesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
