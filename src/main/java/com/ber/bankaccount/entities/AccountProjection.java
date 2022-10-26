package com.ber.bankaccount.entities;

import com.ber.bankaccount.enums.AccountType;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = BankAccount.class,name = "p1")
public interface AccountProjection {
    String getId();
    AccountType getType();
}
