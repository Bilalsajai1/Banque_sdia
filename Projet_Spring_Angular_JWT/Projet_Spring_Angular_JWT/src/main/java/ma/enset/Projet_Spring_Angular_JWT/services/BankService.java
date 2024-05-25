package ma.enset.Projet_Spring_Angular_JWT.services;


import ma.enset.Projet_Spring_Angular_JWT.repositories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BankService {
    @Autowired
    private BankAccountRepository bankAccountRepository;

    public void consulter(){

    }
}
