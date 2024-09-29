package com.tracky.backend.domain.services;

import com.tracky.backend.domain.enums.PaymentTypeEnum;
import com.tracky.backend.domain.model.Account;
import com.tracky.backend.persistence.repository.AccountRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransactionService {
    private final AccountRepository accountRepository;
    public Long updateIncome(Long income, PaymentTypeEnum type) {
        String userId  = "";
//        Account account = accountRepository.getAccount(userId);
        accountRepository.updateIncome(userId, income, type);
        return accountRepository.getAccount(userId).getBalance();
    }
}
