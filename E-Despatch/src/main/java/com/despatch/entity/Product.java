package com.despatch.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.despatch.entity.enumerator.UMEnum;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
 
	@Column(name = "name")
	private String name;

	@Column(name="um")
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
