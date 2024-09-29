package com.tracky.backend.application.controllers;

import com.tracky.backend.application.dtos.expense.ExpenseTransactionRequest;
import com.tracky.backend.application.dtos.expense.ExpenseTransactionResponse;
import com.tracky.backend.domain.enums.PaymentTypeEnum;
import com.tracky.backend.domain.mappers.ExpenseTransactionMapper;
import com.tracky.backend.domain.model.ExpenseTransaction;
import com.tracky.backend.domain.services.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/expense")
@RequiredArgsConstructor
public class ExpenseController {
    private final ExpenseTransactionMapper expenseTransactionMapper;
    private final ExpenseService expenseService;

    @PutMapping
    public ResponseEntity<ExpenseTransactionResponse> addExpense(@RequestBody ExpenseTransactionRequest request, @RequestParam("amount") Long amount, @RequestParam("paymentType") PaymentTypeEnum paymentType) {
        ExpenseTransaction expenseTransaction = expenseTransactionMapper.requestToModel(request);
        ExpenseTransactionResponse response = expenseTransactionMapper.modelToResponse(expenseService.addExpense(expenseTransaction, amount, paymentType));

        return ResponseEntity.ok(response);
    }
}
