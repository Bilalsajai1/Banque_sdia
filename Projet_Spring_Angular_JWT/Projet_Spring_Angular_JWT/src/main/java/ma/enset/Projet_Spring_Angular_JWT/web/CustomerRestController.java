package ma.enset.Projet_Spring_Angular_JWT.web;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import ma.enset.Projet_Spring_Angular_JWT.dtos.*;
import ma.enset.Projet_Spring_Angular_JWT.exceptions.CustomerException;
import ma.enset.Projet_Spring_Angular_JWT.services.*;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@CrossOrigin("*")
public class CustomerRestController {
    private BankAccountService bankAccountService;
    @GetMapping("/customers")
    @PreAuthorize("hasAuthority('SCOPE_USER')")
    public List<CustomerDTO> customer(){
        return bankAccountService.listCostumer();
    }

    @GetMapping("/customers/{id}")
    @PreAuthorize("hasAuthority('SCOPE_USER')")

    public CustomerDTO getCustomer(@PathVariable(name = "id") Long customerId) throws CustomerException {
        return  bankAccountService.getCustomer(customerId);
    }
    @PostMapping("/customers")
    @PreAuthorize("hasAuthority('SCOPE_ADMIN')")

    public CustomerDTO saveCustomer(@RequestBody CustomerDTO customerDTO){
        return  bankAccountService.saveCustomer(customerDTO);
    }
    @PutMapping("/customers/{customerId}")
    @PreAuthorize("hasAuthority('SCOPE_ADMIN')")

    public CustomerDTO updateCustomer(@PathVariable Long customerId ,@RequestBody CustomerDTO customerDTO){
        customerDTO.setId(customerId);
        return bankAccountService.updateCustomer(customerDTO);

    }
    @DeleteMapping("/customers/{id}")
    @PreAuthorize("hasAuthority('SCOPE_ADMIN')")

    public void deleteCustomer(@PathVariable Long id){
            bankAccountService.deleteCustomer(id);
    }
}
