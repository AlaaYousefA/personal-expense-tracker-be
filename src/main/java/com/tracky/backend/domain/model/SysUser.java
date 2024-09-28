package com.tracky.backend.domain.model;

import com.tracky.backend.persistence.entity.AccountEntity;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SysUser {
    private String id;

    private String username;

    private String password;

    private String email;

    private byte[] image;

    private String accountId;
}
