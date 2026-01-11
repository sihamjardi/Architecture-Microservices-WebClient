package ma.siham.customr.repository;

import ma.siham.customr.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository fournit CRUD automatiquement
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
