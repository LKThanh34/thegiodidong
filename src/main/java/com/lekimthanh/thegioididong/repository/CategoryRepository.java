package com.lekimthanh.thegioididong.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lekimthanh.thegioididong.domain.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
