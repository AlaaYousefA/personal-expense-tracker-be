package com.tracky.backend.domain.model;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Account {
    private String id;

    private Long balance;

    private Long cardBalance;

    private Long cashBalance;

    private Long saveBalance;
}
