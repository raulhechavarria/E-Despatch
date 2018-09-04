package com.despatch.rest.request;

import com.despatch.entity.enumerator.UMEnum;

public class ProductRequest {
	private Long id;

	private String name;

	private UMEnum um;

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
