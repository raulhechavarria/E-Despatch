package com.despatch.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer extends Company{
	
	@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "customer")
	private Set<ShippingAddress> addresses;

	public Set<ShippingAddress> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<ShippingAddress> addresses) {
		this.addresses = addresses;
	} 
	
	
	
	
}
