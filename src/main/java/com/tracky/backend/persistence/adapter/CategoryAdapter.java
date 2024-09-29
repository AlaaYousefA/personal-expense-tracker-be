package com.tracky.backend.persistence.adapter;

import com.tracky.backend.persistence.jpa.CategoryJpaRepository;
import com.tracky.backend.persistence.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class CategoryAdapter implements CategoryRepository {
    private final CategoryJpaRepository categoryJpaRepository;
}
