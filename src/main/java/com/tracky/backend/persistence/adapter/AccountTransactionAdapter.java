package com.tracky.backend.persistence.adapter;

import com.tracky.backend.domain.mappers.AccountMapper;
import com.tracky.backend.domain.mappers.AccountTransactionMapper;
import com.tracky.backend.domain.model.AccountTransaction;
import com.tracky.backend.persistence.jpa.AccountJpaRepository;
import com.tracky.backend.persistence.jpa.AccountTransactionJpaRepository;
import com.tracky.backend.persistence.repository.AccountTransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class AccountTransactionAdapter implements AccountTransactionRepository {
    private final AccountTransactionJpaRepository accountTransactionJpaRepository;
    private final AccountTransactionMapper accountTransactionMapper;


    @Override
    public AccountTransaction save(AccountTransaction accountTransaction) {
        return  accountTransactionMapper.entityToModel(
                accountTransactionJpaRepository.save(
                        accountTransactionMapper.modelToEntity(accountTransaction)
                )
        );
    }
}
