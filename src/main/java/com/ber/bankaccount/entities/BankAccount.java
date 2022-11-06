package com.ber.bankaccount.entities;

import com.ber.bankaccount.enums.AccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class BankAccount {
  @Id
    private String id;
    private Date createdate;
    private Double balance;
    private String currency ;
    @Enumerated(EnumType.STRING)
    private AccountType type;
    @ManyToOne()
    private Customer customer;

}
