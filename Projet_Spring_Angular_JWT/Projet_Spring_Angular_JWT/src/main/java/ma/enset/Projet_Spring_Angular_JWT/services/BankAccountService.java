package ma.enset.Projet_Spring_Angular_JWT.services;



import ma.enset.Projet_Spring_Angular_JWT.dtos.*;
import ma.enset.Projet_Spring_Angular_JWT.exceptions.*;

import java.util.List;

public interface BankAccountService {

    CustomerDTO saveCustomer(CustomerDTO customerDTO);

    CurrentBankAccountDTO saveCurrentBankAccount(double initialBalance, double overDraft, Long customerId) throws CustomerException;
     SavingBankAccountDTO saveSavingBankAccount(double initialBalance, double inerestRate, Long customerId) throws CustomerException;

     List<CustomerDTO> listCostumer();
    BankAccountDTO getBankAccount(String accountId) throws BankAccountNotFoundException;
     void debit(String accountId,double montant,String description) throws BankAccountNotFoundException, BalanceNotSufficientException;
     void credit(String accountId,double montant,String description) throws BankAccountNotFoundException, BalanceNotSufficientException;
    void transfer(String accountIdSource,String accountIdDestination,double montant) throws BankAccountNotFoundException, BalanceNotSufficientException;


     List<BankAccountDTO> bankAccountList();

    CustomerDTO getCustomer(Long customerId) throws CustomerException;

    CustomerDTO updateCustomer(CustomerDTO customerDTO);

    void deleteCustomer(Long customerId);

    List<OperationDTO> accountHistory(String accountId);

    AccountHistoryDTO getAccountHistory(String accountId, int page, int size) throws BankAccountNotFoundException;
}
