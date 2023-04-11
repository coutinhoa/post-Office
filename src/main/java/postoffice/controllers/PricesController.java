package postoffice.controllers;

import postoffice.models.Price;
import postoffice.services.PricesService;
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
    List<Price> all() {
        List<Price> prices= service.getAllPrices();
        return prices;
    }
    @GetMapping("/package/{id}/price")
    Optional<Price> getPriceOfPackage(@PathVariable Long id) {
        return service.getPricePackage(id);
    }


}
