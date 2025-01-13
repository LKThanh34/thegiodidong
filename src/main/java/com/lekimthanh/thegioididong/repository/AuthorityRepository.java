package com.lekimthanh.thegioididong.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lekimthanh.thegioididong.domain.Authority;

public interface AuthorityRepository extends  JpaRepository<Authority, Long> {
    
}
