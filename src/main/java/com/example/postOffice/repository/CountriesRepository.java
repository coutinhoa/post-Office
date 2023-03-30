package com.example.postOffice.repository;

import com.example.postOffice.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface  CountriesRepository extends JpaRepository <Country, Long>{
    List<Country> findAll();
}
