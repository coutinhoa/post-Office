package com.example.postOffice.LoadDatabase;
import com.example.postOffice.repository.UsersRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabaseUser {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabaseUser.class);

    @Bean
    CommandLineRunner initDatabase(UsersRepository repository) {

        return args -> {
            /*log.info("Preloading " + repository.save(new User("Bilbo Baggins", "b@email.com")));
            log.info("Preloading " + repository.save(new User("Frodo Baggins", "f@email.com")));
            log.info("Preloading " + repository.save(new User("Cate", "cate@email.com")));
            log.info("Preloading " + repository.save(new User("Diana", "di@email.com")));
            log.info("Preloading " + repository.save(new User("qwertz", "qw@email.com")));
            log.info("Preloading " + repository.save(new User("Anne", "a@email.com")));
            log.info("Preloading " + repository.save(new User("Barbie", "b@email.com")));
            log.info("Preloading " + repository.save(new User("Charlie", "c@email.com")));
            log.info("Preloading " + repository.save(new User("Dimitri", "d@email.com")));
            log.info("Preloading " + repository.save(new User("Francis", "f@email.com")));
            log.info("Preloading " + repository.save(new User("Gwen", "g@email.com")));
            log.info("Preloading " + repository.save(new User("Harry", "h@email.com")));
            log.info("Preloading " + repository.save(new User("Iris",  "i@email.com")));
            log.info("Preloading " + repository.save(new User("John",  "j@email.com")));
            log.info("Preloading " + repository.save(new User("Kate", "k@email.com")));*/
        };
    }
}
