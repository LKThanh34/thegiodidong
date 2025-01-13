package com.lekimthanh.thegioididong.domain;


import java.io.Serializable;
import java.util.List;

import org.aspectj.lang.annotation.SuppressAjWarnings;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@SuppressAjWarnings("serial")
@Data
@Entity
@Table(name = "categories")
public class Category implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long categoryId;
	private String name;
	@JsonIgnore
	@OneToMany(mappedBy = "category")
	List<Product> products;
}
