package com.example.postOffice.repository;

import com.example.postOffice.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompaniesRepository extends JpaRepository<Company, Long> {
    List<Company> findAll();
}
