package postoffice.controllers;

import java.util.List;
import java.util.Optional;

import postoffice.models.Package;
import postoffice.services.PackagesService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
class PackagesController {
    private final PackagesService service;
    PackagesController(PackagesService service) {
        this.service = service;
    }


    @GetMapping("/packages")
    List<Package> all() {
        List<Package> packages= service.getAllPackages();
        return packages;
    }
    @GetMapping("/users/{id}/packages")
    Optional<Package> getPackageByUser(@PathVariable Long id) {
        return service.getPackageUser(id);
    }


}
