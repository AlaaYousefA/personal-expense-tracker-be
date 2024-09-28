package com.tracky.backend.persistence.entity;

import com.tracky.backend.domain.enums.PaymentTypeEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "account_transaction")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "account_transaction")
public class AccountTransactionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private String id;

    @Column(name = "ammount")
    private Long ammount;

   @Column(name = "payment_type")
   @Enumerated(EnumType.STRING)
    private PaymentTypeEnum paymentType;

    @ManyToOne
    @JoinColumn(name = "account_id", referencedColumnName = "id")
    private AccountEntity accountId;
}
