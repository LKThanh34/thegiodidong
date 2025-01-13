package com.lekimthanh.thegioididong.domain;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@SuppressWarnings("serial")
@Entity
@Data
@Table(name = "favorites")
public class Favorite implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long favoriteId;
	private String username;
	
	@ManyToOne
	@JoinColumn(name = "productId")
	private Product product;
}
