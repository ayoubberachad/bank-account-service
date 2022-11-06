package com.ber.bankaccount.entities.repositories;

import com.ber.bankaccount.entities.BankAccount;
import com.ber.bankaccount.entities.Customer;
import com.ber.bankaccount.enums.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

 public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
