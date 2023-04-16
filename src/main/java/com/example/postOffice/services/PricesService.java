package com.example.postOffice.services;
import com.example.postOffice.dto.CreatePriceDTO;
import com.example.postOffice.models.Price;
import com.example.postOffice.repository.PricesRepository;
import com.example.postOffice.repository.CountriesRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PricesService {
   private final PricesRepository repository;
   private final CountriesRepository countriesRepository;

    PricesService(PricesRepository repository, CountriesRepository countriesRepository1) {
        this.repository = repository;
        this.countriesRepository = countriesRepository1;
    }
    public List<Price> getAllPrices(){return repository.findAll();}

    public Price createPrice(CreatePriceDTO newPrice) {
        var pr = new Price();
        pr.setPrice(newPrice.getPrice());


        var senderCountry = countriesRepository.findById(newPrice.getSender_country_id());
        pr.setSenderCountry(senderCountry.get());
        var addresseeCountry = countriesRepository.findById(newPrice.getAddressee_country_id());
        pr.setAddresseeCountry(addresseeCountry.get());

        return repository.save(pr);
    }
}
