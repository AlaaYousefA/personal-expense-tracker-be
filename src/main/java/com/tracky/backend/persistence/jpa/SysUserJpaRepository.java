package com.tracky.backend.persistence.jpa;

import com.tracky.backend.persistence.entity.SysUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserJpaRepository extends JpaRepository<SysUserEntity, String>{
}
