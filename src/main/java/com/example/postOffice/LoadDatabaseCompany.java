package com.example.postOffice;

import com.example.postOffice.models.Company;
import com.example.postOffice.repository.CompaniesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
class LoadDatabaseCompany {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabaseCompany.class);

    @Bean
    CommandLineRunner initDatabaseCompanies(CompaniesRepository repository) {

        return args -> {
            /*log.info("Preloading " + repository.save(new Company("AA")));
            log.info("Preloading " + repository.save(new Company("BB")));
            log.info("Preloading " + repository.save(new Company("CC")));
            log.info("Preloading " + repository.save(new Company("DD")));
            log.info("Preloading " + repository.save(new Company("EE")));*/
        };
        //loading not working so
        // INSERT INTO companies (name) VALUES ('AA'), ('BB'), ('CC'), ('DD'), ('EE');
    }
}
