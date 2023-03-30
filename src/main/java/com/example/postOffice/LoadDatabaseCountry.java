package com.example.postOffice;

import com.example.postOffice.models.Country;
import com.example.postOffice.repository.CountriesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
class LoadDatabaseCountry {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabaseCountry.class);

    @Bean
    CommandLineRunner initDatabaseCountries(CountriesRepository repository) {

        return args -> {
           /* log.info("Preloading " + repository.save(new Country("De")));
            log.info("Preloading " + repository.save(new Country("Pt")));
            log.info("Preloading " + repository.save(new Country("Spain")));
            log.info("Preloading " + repository.save(new Country("France")));
            log.info("Preloading " + repository.save(new Country("Netherlands")));*/
        };
    }
}
