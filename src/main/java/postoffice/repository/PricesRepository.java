package postoffice.repository;

import postoffice.models.Price;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PricesRepository extends JpaRepository<Price, Long> {
    List<Price> findAll();
    Optional<Price> findById(Long id);

}
