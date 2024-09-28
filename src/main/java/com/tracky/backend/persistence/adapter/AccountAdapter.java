package com.tracky.backend.persistence.adapter;

import com.tracky.backend.application.exception.AccountNotFoundException;
import com.tracky.backend.domain.enums.PaymentTypeEnum;
import com.tracky.backend.domain.mappers.AccountMapper;
import com.tracky.backend.domain.model.Account;
import com.tracky.backend.persistence.entity.AccountEntity;
import com.tracky.backend.persistence.entity.SysUserEntity;
import com.tracky.backend.persistence.jpa.AccountJpaRepository;
import com.tracky.backend.persistence.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class AccountAdapter implements AccountRepository {
    private final AccountJpaRepository accountJpaRepository;
    private final AccountMapper accountMapper;


    @Override
    public Account getAccount(String accountId) {
        AccountEntity accountEntity = accountJpaRepository.findById(accountId).orElseThrow(
                () -> new AccountNotFoundException("Account with id " + accountId + " not found"));

        return accountMapper.entityToModel(accountEntity);
    }

    @Override
    public void updateIncome(String userId, Long income, PaymentTypeEnum type) {
        String accountId =  getAccount(userId).getId();
        accountJpaRepository.updateIncomeForType(accountId,income,type.toString());
    }
}
