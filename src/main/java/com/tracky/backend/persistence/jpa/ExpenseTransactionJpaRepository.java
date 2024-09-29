package com.tracky.backend.persistence.jpa;

import com.tracky.backend.persistence.entity.ExpenseTransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseTransactionJpaRepository  extends JpaRepository<ExpenseTransactionEntity, String> {
}
