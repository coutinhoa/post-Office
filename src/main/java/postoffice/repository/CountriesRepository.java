package postoffice.repository;

import postoffice.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface  CountriesRepository extends JpaRepository <Country, Long>{
    List<Country> findAll();
}
