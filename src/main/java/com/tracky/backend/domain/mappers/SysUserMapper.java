package com.tracky.backend.domain.mappers;

import com.tracky.backend.domain.model.SysUser;
import com.tracky.backend.persistence.entity.SysUserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SysUserMapper {

    @Mapping(source = "account.id", target = "accountId")
    SysUser entityToModel(SysUserEntity sysUserEntity);

    @Mapping(source = "accountId", target = "account.id")
    SysUserEntity modelToEntity(SysUser sysUser);
}
