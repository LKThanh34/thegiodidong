package com.lekimthanh.thegioididong.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.lekimthanh.thegioididong.domain.Category;
import com.lekimthanh.thegioididong.repository.CategoryRepository;
import com.lekimthanh.thegioididong.service.CategoryService;

@Service
public class CategoryServiceimpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public CategoryServiceimpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Page<Category> findAll(Pageable pageable) {
        return categoryRepository.findAll(pageable);
    }

    @Override
    public long countByNameContaining(String name) {
        return categoryRepository.countByNameContaining(name);
    }

    @Override
    public <S extends Category> S save(S entity) {
        return categoryRepository.save(entity);
    }

    @Override
    public void deleteById(Long id) {
        categoryRepository.deleteById(id);
    }

}
