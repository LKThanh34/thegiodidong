package com.lekimthanh.thegioididong.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lekimthanh.thegioididong.domain.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    
}
