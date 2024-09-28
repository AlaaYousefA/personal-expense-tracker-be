package com.tracky.backend.persistence.adapter;

import com.tracky.backend.application.exception.UserNotFoundException;
import com.tracky.backend.domain.mappers.SysUserMapper;
import com.tracky.backend.domain.model.SysUser;
import com.tracky.backend.persistence.entity.SysUserEntity;
import com.tracky.backend.persistence.jpa.SysUserJpaRepository;
import com.tracky.backend.persistence.repository.SysUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SysUserAdapter implements SysUserRepository {
    private final SysUserJpaRepository sysUserJpaRepository;
    private final SysUserMapper sysUserMapper;

    @Override
    public SysUser getUserById(String id)  {

        return sysUserMapper.entityToModel(sysUserJpaRepository.findById(id).orElseThrow(
                () -> new UserNotFoundException("User with id " + id + " not found")
        ));
    }
}
