package com.tracky.backend.persistence.repository;

import com.tracky.backend.domain.model.SysUser;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserRepository {

    SysUser getUserById(String userId);
}
