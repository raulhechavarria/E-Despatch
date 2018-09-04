package com.despatch.service.dto;

import com.despatch.entity.enumerator.UMEnum;

public class ProductDto {
	private Long id;

	private String name;

	private UMEnum um;

	
	
	public ProductDto(Long id, String name, UMEnum um) {
		super();
		this.id = id;
		this.name = name;
		this.um = um;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UMEnum getUm() {
		return um;
	}

	public void setUm(UMEnum um) {
		this.um = um;
	}

	
}

