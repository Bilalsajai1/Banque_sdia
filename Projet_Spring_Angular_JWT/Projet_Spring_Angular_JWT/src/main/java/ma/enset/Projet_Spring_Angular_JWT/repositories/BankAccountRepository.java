package ma.enset.Projet_Spring_Angular_JWT.repositories;

import ma.enset.Projet_Spring_Angular_JWT.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {

}
