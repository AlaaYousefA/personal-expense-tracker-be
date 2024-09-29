package com.tracky.backend.domain.mappers;

import com.tracky.backend.application.dtos.expense.ExpenseTransactionRequest;
import com.tracky.backend.application.dtos.expense.ExpenseTransactionResponse;
import com.tracky.backend.domain.model.ExpenseTransaction;
import com.tracky.backend.persistence.entity.ExpenseTransactionEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ExpenseTransactionMapper {
    ExpenseTransaction requestToModel(ExpenseTransactionRequest expenseTransactionRequest);
    ExpenseTransactionResponse modelToResponse(ExpenseTransaction expenseTransaction);

    @Mapping(target = "account.id", source = "accountId")
    @Mapping(target = "category.id", source = "categoryId")
    ExpenseTransactionEntity modelToEntity(ExpenseTransaction expenseTransaction);

    @Mapping(target = "accountId", source = "account.id")
    @Mapping(target = "categoryId", source = "category.id")
    ExpenseTransaction entityToModel(ExpenseTransactionEntity expenseTransactionEntity);
}
