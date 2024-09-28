package com.tracky.backend.domain.services;

import com.tracky.backend.domain.model.Account;
import com.tracky.backend.domain.model.SysUser;
import com.tracky.backend.persistence.entity.AccountEntity;
import com.tracky.backend.persistence.entity.SysUserEntity;
import com.tracky.backend.persistence.repository.AccountRepository;
import com.tracky.backend.persistence.repository.SysUserRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Data
public class AccountService {
    private final AccountRepository accountRepository;
    private final SysUserRepository sysUserRepository;
    public Long getTotalBalance(String userId) {
        SysUser user = sysUserRepository.getUserById(userId);
        String accountId = user.getAccountId();
        Account account = accountRepository.getAccount(accountId);
        return account.getBalance();
    }


}
