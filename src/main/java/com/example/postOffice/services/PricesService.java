package com.example.postOffice.services;
import com.example.postOffice.models.Package;
import com.example.postOffice.repository.PricesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PricesService {

   private final PricesRepository repository;
    PricesService(PricesRepository repository) {this.repository = repository;}

    public List<Package> getAllPrices(){return repository.findAll();}
    public Optional<Package> getPricePackage(Long id){return repository.findById(id);}

}
