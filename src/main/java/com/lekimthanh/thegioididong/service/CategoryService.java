package com.lekimthanh.thegioididong.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.lekimthanh.thegioididong.domain.Category;

public interface CategoryService {

    <S extends Category> S save(S entity);


    List<Category> findAll();

    Page<Category> findAll(Pageable pageable);

    Optional<Category> findById(Long id);

    Category getById(Long id);

    Category getOne(Long id);

    Category getReferenceById(Long id);

    List<Category> findAllById(Iterable<Long> ids);

    Page<Category> findByNameContaining(String name, Pageable pageable);

    long count();

    long countByNameContaining(String name);

    boolean existsById(Long id);

    // delete

    void delete(Category entity);

    void deleteById(Long categoryId);

    void deleteAll();

    void deleteAll(Iterable<? extends Category> entities);

    void deleteAllById(Iterable<? extends Long> ids);

    void deleteInBatch(Iterable<Category> entities);

    void deleteAllInBatch();

    void deleteAllInBatch(Iterable<Category> entities);

    void deleteAllByIdInBatch(Iterable<Long> ids);

}
