package com.lekimthanh.thegioididong.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lekimthanh.thegioididong.domain.Order;

@Repository
public interface OrderDetailRepository extends JpaRepository<Order, Long> {
    
}
