package com.tracky.backend.persistence.repository;

import com.tracky.backend.domain.model.ExpenseTransaction;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseTransactionRepository {
    ExpenseTransaction save(ExpenseTransaction expenseTransaction);
}
