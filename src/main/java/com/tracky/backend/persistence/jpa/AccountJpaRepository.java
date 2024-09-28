package com.tracky.backend.persistence.jpa;

import com.tracky.backend.persistence.entity.AccountEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AccountJpaRepository extends JpaRepository <AccountEntity, String>{
    @Modifying
    @Transactional
    @Query("UPDATE account a SET " +
            "a.balance = a.balance + :income, " +
            "a.cardBalance = a.cardBalance + (CASE WHEN :type = 'CARD' THEN :income ELSE 0 END), " +
            "a.cashBalance = a.cashBalance + (CASE WHEN :type = 'CASH' THEN :income ELSE 0 END), " +
            "a.saveBalance = a.saveBalance + (CASE WHEN :type = 'SAVE' THEN :income ELSE 0 END) " +
            "WHERE a.id = :accountId")
    void updateIncomeForType(@Param("accountId") String accountId, @Param("income") Long income, @Param("type") String type);
}
