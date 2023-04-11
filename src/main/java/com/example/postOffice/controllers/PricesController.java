package com.example.postOffice.controllers;

import com.example.postOffice.models.Package;
import com.example.postOffice.services.PricesService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
class PricesController {
    private final PricesService service;
    PricesController(PricesService service) {
        this.service = service;
    }


    @GetMapping("/packages/price")
    List<Package> all() {
        List<Package> packages= service.getAllPrices();
        return packages;
    }
    @GetMapping("/package/{id}/price")
    Optional<Package> getPriceOfPackage(@PathVariable Long id) {
        return service.getPricePackage(id);
    }


}
