package com.despatch.entity.company;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer extends Company{
	
/*	@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "ShippingAddress")
	private Set<ShippingAddress> addresses;

	public Set<ShippingAddress> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<ShippingAddress> addresses) {
		this.addresses = addresses;
	} 
	*/
	
	
	
}
