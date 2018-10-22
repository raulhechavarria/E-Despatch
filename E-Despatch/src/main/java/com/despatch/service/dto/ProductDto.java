package com.despatch.service.dto;

import com.despatch.entity.enumerator.UMEnum;

public class ProductDto {
	private Long id;

	private String name;
	
	private String description;
	
	private String price;
	
	private String weight;

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	private UMEnum um;

	
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

	public ProductDto(Long id, String name, String description, String price, String weight, UMEnum um) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.weight = weight;
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

