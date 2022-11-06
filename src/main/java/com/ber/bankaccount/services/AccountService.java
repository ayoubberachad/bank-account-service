package com.ber.bankaccount.services;

import com.ber.bankaccount.dto.BankAccountRequestDTO;
import com.ber.bankaccount.dto.BankAccountResponseDTO;
import com.ber.bankaccount.entities.BankAccount;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface AccountService {
    BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);

    BankAccountResponseDTO updateAccount(String id, BankAccountRequestDTO bankAccountDTO);

    Boolean deleteAccount(String id);
}
