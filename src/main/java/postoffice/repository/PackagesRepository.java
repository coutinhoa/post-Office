package postoffice.repository;

import postoffice.models.Package;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PackagesRepository extends JpaRepository<Package, Long> {
    List<Package> findAll();
    Optional<Package> findById(Long id);

}
