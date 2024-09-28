package com.tracky.backend.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "account")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "account")
public class AccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private String id;

    @Column(name = "balance")
    private Long balance;

    @Column(name = "card_balance")
    private Long cardBalance;

    @Column(name = "cash_balance")
    private Long cashBalance;

    @Column(name = "save_balance")
    private Long saveBalance;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private SysUserEntity userId;

    @OneToMany(mappedBy = "accountId")
    private List<AccountTransactionEntity> transactions;  // One account has many transactions
}
