package com.example.postOffice.repository;

import com.example.postOffice.models.Package;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PricesRepository extends JpaRepository<Package, Long> {
    List<Package> findAll();
    Optional<Package> findById(Long id);

}
