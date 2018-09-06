package com.despatch.entity;

import javax.persistence.*;

import com.despatch.entity.company.Customer;

@Entity
@Table(name = "shippingAddress")
public class ShippingAddress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "customer_id", nullable = true)
	private Customer customer;
	
	@Column(name = "address")
	private String address;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
