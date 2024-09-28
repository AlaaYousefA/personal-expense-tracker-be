package com.tracky.backend.domain.mappers;

import com.tracky.backend.domain.model.Account;
import com.tracky.backend.persistence.entity.AccountEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountMapper {
    Account entityToModel(AccountEntity accountEntity);
    AccountEntity accountModelToEntity(Account account);
}
