package ma.enset.Projet_Spring_Angular_JWT.dtos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import ma.enset.Projet_Spring_Angular_JWT.enums.AccountStatus;


import java.util.Date;
import java.util.List;


@Data


public  class SavingBankAccountDTO extends  BankAccountDTO{
    private String id;
    private Date createdAt;
    private double balance;
    private AccountStatus status;
    private CustomerDTO customerDTO;
    private double interestRate;
}
