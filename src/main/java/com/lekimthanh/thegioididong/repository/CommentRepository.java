package com.lekimthanh.thegioididong.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lekimthanh.thegioididong.domain.Comment;


@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    
}
