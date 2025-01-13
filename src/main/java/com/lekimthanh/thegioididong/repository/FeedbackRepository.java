package com.lekimthanh.thegioididong.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lekimthanh.thegioididong.domain.FeedBack;

@Repository
public interface FeedbackRepository extends JpaRepository<FeedBack, Long>  {
    
}
