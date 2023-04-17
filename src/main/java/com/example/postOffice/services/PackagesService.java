package com.example.postOffice.services;
import com.example.postOffice.dto.CreatePackageDTO;
import com.example.postOffice.models.Package;
import com.example.postOffice.repository.CountriesRepository;
import com.example.postOffice.repository.PackagesRepository;
import com.example.postOffice.repository.PricesRepository;
import com.example.postOffice.repository.UsersRepository;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class PackagesService {

    private final UsersRepository usersRepository;
   private final PackagesRepository packagesRepository;
    private final CountriesRepository countriesRepository;
    private final PricesRepository pricesRepository;

    PackagesService(PackagesRepository packagesRepository, UsersRepository usersRepository,
                    CountriesRepository countriesRepository, PricesRepository pricesRepository) {
        this.packagesRepository = packagesRepository;
        this.usersRepository = usersRepository;
        this.countriesRepository = countriesRepository;
        this.pricesRepository = pricesRepository;
    }

    public List<Package> getAllPackages(){return packagesRepository.findAll();}
    public Optional<Package> getPackageUser(Long id){return packagesRepository.findById(id);}


    public Package createPackage(CreatePackageDTO newPackage) {
        var p = new Package();
        p.setWeight(newPackage.getWeight());
        p.setDelivery_date(newPackage.getDelivery_date());

        var price = pricesRepository.findBySenderCountryIdAndAddresseeCountryId(newPackage.getSender_country_id(), newPackage.getAddressee_country_id()).get();
        p.setDelivery_price(CalculatePackagePriceService.calculate(price.getPrice(), newPackage.getWeight()));

        var sender = usersRepository.findById(newPackage.getSender_id());
        p.setSender(sender.get());
        var addressee = usersRepository.findById(newPackage.getAddressee_id());
        p.setAddressee(addressee.get());

        var senderCountry = countriesRepository.findById(newPackage.getSender_country_id());
        p.setSenderCountry(senderCountry.get());
        var addresseeCountry = countriesRepository.findById(newPackage.getAddressee_country_id());
        p.setAddressee_country(addresseeCountry.get());

        return packagesRepository.save(p);
    }

}
