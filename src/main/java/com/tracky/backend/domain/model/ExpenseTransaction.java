package com.tracky.backend.domain.model;

import com.tracky.backend.persistence.entity.AccountEntity;
import com.tracky.backend.persistence.entity.CategoryEntity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExpenseTransaction {
    private String id;

    private String accountId;

    private String categoryId;

    private LocalDateTime createdAt;
}
