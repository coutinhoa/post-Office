package com.example.postOffice.controllers;

import java.util.List;
import java.util.Optional;

import com.example.postOffice.dto.CreatePackageDTO;
import com.example.postOffice.models.Package;
import com.example.postOffice.services.PackagesService;
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
    @GetMapping("/packages/{id}")
    Optional<Package> getPackageByUser(@PathVariable Long id) {
        return service.getPackageUser(id);
    }

    @PostMapping("/package")
    Package newPackage(@RequestBody CreatePackageDTO newPackage){
        return service.createPackage(newPackage);
    }

}
