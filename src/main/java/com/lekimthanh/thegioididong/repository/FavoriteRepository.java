package com.lekimthanh.thegioididong.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lekimthanh.thegioididong.domain.Favorite;

@Repository
public interface FavoriteRepository extends JpaRepository<Favorite, Long> {
    
}
