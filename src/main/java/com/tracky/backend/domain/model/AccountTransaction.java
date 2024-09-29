package com.tracky.backend.domain.model;

import com.tracky.backend.domain.enums.PaymentTypeEnum;
import com.tracky.backend.persistence.entity.AccountEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountTransaction {
    private String id;

    private Long amount;

    private PaymentTypeEnum paymentType;

    private String accountId;

    private LocalDateTime createdAt;
}
