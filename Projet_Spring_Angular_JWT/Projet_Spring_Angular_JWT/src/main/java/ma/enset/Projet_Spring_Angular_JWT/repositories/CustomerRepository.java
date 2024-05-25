package ma.enset.Projet_Spring_Angular_JWT.repositories;

import ma.enset.Projet_Spring_Angular_JWT.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
