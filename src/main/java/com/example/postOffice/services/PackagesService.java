package com.example.postOffice.services;
import com.example.postOffice.dto.CreatePackageDTO;
import com.example.postOffice.models.Package;
import com.example.postOffice.repository.CountriesRepository;
import com.example.postOffice.repository.PackagesRepository;
import com.example.postOffice.repository.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PackagesService {

    private final UsersRepository usersRepository;
   private final PackagesRepository repository;
    private final CountriesRepository countriesRepository;

    PackagesService(PackagesRepository repository, UsersRepository usersRepository,
                    CountriesRepository countriesRepository) {
        this.repository = repository;
        this.usersRepository = usersRepository;
        this.countriesRepository = countriesRepository;
    }

    public List<Package> getAllPackages(){return repository.findAll();}
    public Optional<Package> getPackageUser(Long id){return repository.findById(id);}

    public Package createPackage(CreatePackageDTO newPackage) {
        var p = new Package();
        p.setWeight(newPackage.getWeight());
        p.setDelivery_date(newPackage.getDelivery_date());

        var sender = usersRepository.findById(newPackage.getSender_id());
        p.setSender(sender.get());
        var addressee = usersRepository.findById(newPackage.getAddressee_id());
        p.setAddressee(addressee.get());

        var senderCountry = countriesRepository.findById(newPackage.getSender_country_id());
        p.setSenderCountry(senderCountry.get());
        var addresseeCountry = countriesRepository.findById(newPackage.getAddressee_country_id());
        p.setAddressee_country(addresseeCountry.get());

        return repository.save(p);
    }

}
