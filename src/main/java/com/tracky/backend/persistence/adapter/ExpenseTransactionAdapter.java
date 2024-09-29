package com.tracky.backend.persistence.adapter;

import com.tracky.backend.domain.mappers.ExpenseTransactionMapper;
import com.tracky.backend.domain.model.ExpenseTransaction;
import com.tracky.backend.persistence.jpa.ExpenseTransactionJpaRepository;
import com.tracky.backend.persistence.repository.ExpenseTransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ExpenseTransactionAdapter implements ExpenseTransactionRepository{
    private final ExpenseTransactionJpaRepository expenseTransactionJpaRepository;
    private final ExpenseTransactionMapper expenseTransactionMapper;


    @Override
    public ExpenseTransaction save(ExpenseTransaction expenseTransaction) {
        return  expenseTransactionMapper.entityToModel(
                expenseTransactionJpaRepository.save(
                        expenseTransactionMapper.modelToEntity(expenseTransaction)
                )
        );
    }
}
