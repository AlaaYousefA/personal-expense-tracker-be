package com.tracky.backend.application.dtos.expense;

import com.tracky.backend.domain.enums.PaymentTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExpenseTransactionRequest {
    private String categoryId;
    private String accountId;
}
