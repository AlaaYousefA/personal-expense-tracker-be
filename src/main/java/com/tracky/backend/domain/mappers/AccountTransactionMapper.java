package com.tracky.backend.domain.mappers;

import com.tracky.backend.domain.model.Account;
import com.tracky.backend.domain.model.AccountTransaction;
import com.tracky.backend.persistence.entity.AccountTransactionEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AccountTransactionMapper {
    @Mapping(target = "account.id", source = "accountId")
    AccountTransaction entityToModel(AccountTransactionEntity accountTransactionEntity);

    @Mapping(target = "accountId", source = "account.id")
    AccountTransactionEntity modelToEntity(AccountTransaction accountTransaction);
}
