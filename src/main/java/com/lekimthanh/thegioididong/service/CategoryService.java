package com.lekimthanh.thegioididong.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.lekimthanh.thegioididong.domain.Category;

public interface CategoryService {

    List<Category> findAll();

    Optional<Category> findById(Long id);

    void deleteById(Long CategoryId);

    <S extends Category> S save(S entity);

    Page<Category> findByNameContaining(String name, Pageable pageable);

    Page<Category> findAll(Pageable pageable);

    // Đếm số lượng danh mục theo tên
    long countByNameContaining(String name);
}
