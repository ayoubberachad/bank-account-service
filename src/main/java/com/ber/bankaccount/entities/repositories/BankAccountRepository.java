package com.ber.bankaccount.entities.repositories;

import com.ber.bankaccount.entities.BankAccount;
import com.ber.bankaccount.enums.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RepositoryRestResource
public interface BankAccountRepository extends JpaRepository<BankAccount, String>{
    @RestResource(path ="/byType")
    List<BankAccount> findByType(@Param("t") AccountType type);
}
