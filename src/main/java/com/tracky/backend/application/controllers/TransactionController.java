package com.tracky.backend.application.controllers;

import com.tracky.backend.domain.enums.PaymentTypeEnum;
import com.tracky.backend.domain.services.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/transaction")
@RequiredArgsConstructor
public class TransactionController {
    private final TransactionService transactionService;


    @PutMapping//update total balance
    public ResponseEntity<Long> updateIncome(@RequestParam("income") Long income, @RequestParam("type") PaymentTypeEnum type) {
        return ResponseEntity.ok(transactionService.updateIncome(income, type));
    }

}
