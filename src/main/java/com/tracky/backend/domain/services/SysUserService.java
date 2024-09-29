package com.tracky.backend.domain.services;

import com.tracky.backend.domain.model.SysUser;
import com.tracky.backend.persistence.repository.SysUserRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SysUserService {
    private final SysUserRepository sysUserRepository;

    public SysUser getUserById(String userId) {
        return sysUserRepository.getUserById(userId);
    }
}
