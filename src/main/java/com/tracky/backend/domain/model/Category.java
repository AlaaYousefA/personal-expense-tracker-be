package com.tracky.backend.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Category {
    private String id;

    private String name;

    private byte[] icon;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
