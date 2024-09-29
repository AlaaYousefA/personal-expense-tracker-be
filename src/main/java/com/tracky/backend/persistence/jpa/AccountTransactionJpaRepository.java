package com.tracky.backend.persistence.jpa;

import com.tracky.backend.persistence.entity.AccountTransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountTransactionJpaRepository extends JpaRepository<AccountTransactionEntity, String> {
}
