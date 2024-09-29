package com.tracky.backend.persistence.repository;

import com.tracky.backend.domain.model.AccountTransaction;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountTransactionRepository {
    AccountTransaction save(AccountTransaction accountTransaction);
}
