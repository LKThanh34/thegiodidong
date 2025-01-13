package com.lekimthanh.thegioididong.DTO;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDTO {
    private static final long serialVersionUID = 1L;
	private Long categoryId;
	@NotEmpty
	private String name;
	private Boolean isEdit = false;
}
