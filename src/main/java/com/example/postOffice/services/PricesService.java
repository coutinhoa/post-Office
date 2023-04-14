package com.example.postOffice.services;
import com.example.postOffice.models.Price;
import com.example.postOffice.repository.PricesRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PricesService {
   private final PricesRepository repository;

    PricesService(PricesRepository repository) {
        this.repository = repository;
        }
    public List<Price> getAllPrices(){return repository.findAll();}
}
