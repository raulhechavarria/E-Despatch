package com.despatch.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.despatch.entity.enumerator.StatusEnum;

@Entity
@Table(name = "orderDispatch")
public class OrderDispatch {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "truckNumber")
	private String truckNumber;
	
	@Column(name = "trailer")
	private String trailer;
	
	@Column(name = "status")
	private StatusEnum status;

	@Column(name = "orderDispatchNumber")
	private String orderDispatchNumber;
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTruckNumber() {
		return truckNumber;
	}

	public void setTruckNumber(String truckNumber) {
		this.truckNumber = truckNumber;
	}

	public String getTrailer() {
		return trailer;
	}

	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((trailer == null) ? 0 : trailer.hashCode());
		result = prime * result + ((truckNumber == null) ? 0 : truckNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderDispatch other = (OrderDispatch) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (status != other.status)
			return false;
		if (trailer == null) {
			if (other.trailer != null)
				return false;
		} else if (!trailer.equals(other.trailer))
			return false;
		if (truckNumber == null) {
			if (other.truckNumber != null)
				return false;
		} else if (!truckNumber.equals(other.truckNumber))
			return false;
		return true;
	}

	public String getOrderDispatchNumber() {
		return orderDispatchNumber;
	}
	
	

	public void setOrderDispatchNumber(String orderDispatchNumber) {
		if (orderDispatchNumber == null) {
			this.orderDispatchNumber = truckNumber+ "-" + hashCode();
		} else {
			this.orderDispatchNumber = orderDispatchNumber;
		}
		
	}

	
}
