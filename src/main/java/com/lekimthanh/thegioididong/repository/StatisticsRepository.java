package com.lekimthanh.thegioididong.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lekimthanh.thegioididong.domain.Statistics;

@Repository
public interface StatisticsRepository extends JpaRepository<Statistics, Long> {
    
}
