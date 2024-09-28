package com.tracky.backend.application.controllers;

import com.tracky.backend.domain.model.SysUser;
import com.tracky.backend.domain.services.SysUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class SysUserController {
    private final SysUserService sysUserService;

    @GetMapping("/{userId}")
    public ResponseEntity<SysUser> getUserById(@PathVariable String userId) {
        return ResponseEntity.ok(sysUserService.getUserById(userId));
    }
}
