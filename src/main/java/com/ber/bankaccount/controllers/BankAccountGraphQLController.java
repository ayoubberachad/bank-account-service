package com.ber.bankaccount.controllers;

import com.ber.bankaccount.dto.BankAccountRequestDTO;
import com.ber.bankaccount.dto.BankAccountResponseDTO;
import com.ber.bankaccount.entities.BankAccount;
import com.ber.bankaccount.entities.Customer;
import com.ber.bankaccount.entities.repositories.BankAccountRepository;
import com.ber.bankaccount.entities.repositories.CustomerRepository;
import com.ber.bankaccount.enums.AccountType;
import com.ber.bankaccount.services.AccountService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
public class BankAccountGraphQLController {
    @Autowired
    private BankAccountRepository bankAccountRepository ;
    @Autowired
private AccountService accountService;
    @Autowired
    private CustomerRepository customerRepository;

@QueryMapping
private List<BankAccount> accountsList(){
    return bankAccountRepository.findAll();

}
    @QueryMapping
    public BankAccount bankAccount(@Argument String id) {
        return bankAccountRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(String.format("Account %s not found ", id))
                );
    }

    @MutationMapping
    public BankAccountResponseDTO addBankAccount(@Argument BankAccountRequestDTO bankAccount) {
        return accountService.addAccount(bankAccount);
    }

    @MutationMapping
    public BankAccountResponseDTO updateAccount(@Argument String id,@Argument BankAccountRequestDTO bankAccount) {
        return accountService.updateAccount(id,bankAccount);
    }
    @MutationMapping
    public Boolean   deleteAccount(@Argument String id) {
         accountService.deleteAccount(id);
         return true;
    }
    @QueryMapping
    private List<Customer> customersList(){
        return customerRepository.findAll();

    }
}
