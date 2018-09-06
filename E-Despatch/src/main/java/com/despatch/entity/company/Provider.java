package com.despatch.entity.company;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.despatch.entity.Product;

@Entity
@Table(name = "provider")
public class Provider extends Company {
	
	
	@ManyToOne
	@JoinColumn(name = "product_id", nullable = true)
	private Product product;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
}
