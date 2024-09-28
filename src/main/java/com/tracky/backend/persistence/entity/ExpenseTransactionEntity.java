package com.tracky.backend.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "expense_transaction")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "expense_transaction")
public class ExpenseTransactionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private String id;

    @Column(name = "account_id")
    private String accountId;

    @Column(name = "expense_id")
    private String expenseId;
}
