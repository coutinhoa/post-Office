package com.example.postOffice;

import com.example.postOffice.models.Package;
import com.example.postOffice.repository.PackagesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
class LoadDatabasePackage {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabasePackage.class);

    @Bean
    CommandLineRunner initDatabasePackages(PackagesRepository repository) {

        return args -> {
          /* log.info("Preloading " + repository.save(new Package(2.0, "10-04-2021")));
        log.info("Preloading " + repository.save(new Package(2.5, "12-06-2022")));
        log.info("Preloading " + repository.save(new Package(1.3, "09-01-2021")));
      log.info("Preloading " + repository.save(new Package(2.1, "02-05-2023")));
        log.info("Preloading " + repository.save(new Package(5.2, "20-03-2022")));
        log.info("Preloading " + repository.save(new Package(4.2, "20-03-2022")));
      log.info("Preloading " + repository.save(new Package(2.0, "09-01-2021")));
        log.info("Preloading " + repository.save(new Package(3.9, "11-07-2022")));
        log.info("Preloading " + repository.save(new Package(0.7,"03-11-2022")));*/
        };
    }
}
