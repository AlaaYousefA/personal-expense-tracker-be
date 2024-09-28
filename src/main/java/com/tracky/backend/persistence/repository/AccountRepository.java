package com.tracky.backend.persistence.repository;

import com.tracky.backend.domain.enums.PaymentTypeEnum;
import com.tracky.backend.domain.model.Account;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository {
    Account getAccount(String accountId);

    void updateIncome(String userId, Long income, PaymentTypeEnum type);
}
