package com.example.postOffice.controllers;

import com.example.postOffice.models.Price;
import com.example.postOffice.services.PricesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
class PricesController {
    private final PricesService service;
    PricesController(PricesService service) {
        this.service = service;
    }

    @GetMapping("/prices")
    List<Price> all() {
        List<Price> prices= service.getAllPrices();
        return prices;
    }

}
