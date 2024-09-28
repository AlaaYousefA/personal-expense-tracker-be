package com.tracky.backend.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "expense")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "expense")
public class ExpenseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID )
    @Column(name = "id")
    private String id;

    private String name;

    private byte[] icon;
}
