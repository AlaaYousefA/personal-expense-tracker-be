package com.tracky.backend.application.controllers;

import com.tracky.backend.domain.services.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/account")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;
    @GetMapping("/{userId}")
    public ResponseEntity<Long> getTotalBalance(@PathVariable String userId) {
        return ResponseEntity.ok(accountService.getTotalBalance(userId));
    }
}
