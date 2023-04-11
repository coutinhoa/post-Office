package postoffice.services;
import postoffice.models.Package;
import postoffice.repository.PackagesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PackagesService {

   private final PackagesRepository repository;
    PackagesService(PackagesRepository repository) {this.repository = repository;}

    public List<Package> getAllPackages(){return repository.findAll();}
    public Optional<Package> getPackageUser(Long id){return repository.findById(id);}

}
