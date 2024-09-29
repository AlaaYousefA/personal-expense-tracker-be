package com.tracky.backend.domain.services;

import com.tracky.backend.application.dtos.expense.ExpenseTransactionResponse;
import com.tracky.backend.domain.enums.PaymentTypeEnum;
import com.tracky.backend.domain.model.Account;
import com.tracky.backend.domain.model.AccountTransaction;
import com.tracky.backend.domain.model.ExpenseTransaction;
import com.tracky.backend.persistence.repository.AccountRepository;
import com.tracky.backend.persistence.repository.AccountTransactionRepository;
import com.tracky.backend.persistence.repository.ExpenseTransactionRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class ExpenseService {
    private final ExpenseTransactionRepository expenseTransactionRepository;
    private final AccountTransactionRepository accountTransactionRepository;

    public ExpenseTransaction addExpense(ExpenseTransaction expenseTransaction, Long amount, PaymentTypeEnum paymentType) {

        AccountTransaction accountTransaction = AccountTransaction.builder()
                .amount(amount)
                .paymentType(paymentType)
                .createdAt(LocalDateTime.now())
                .accountId(expenseTransaction.getAccountId())
                .build();

        expenseTransaction.setCreatedAt(LocalDateTime.now());

        accountTransactionRepository.save(accountTransaction);
        return expenseTransactionRepository.save(expenseTransaction);
    }
}
