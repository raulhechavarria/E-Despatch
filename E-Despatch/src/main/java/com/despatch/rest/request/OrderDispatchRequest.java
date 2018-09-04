package com.despatch.rest.request;

import com.despatch.entity.enumerator.StatusEnum;
import com.despatch.entity.enumerator.TypeCompanyEnum;

public class OrderDispatchRequest {

	private Long id;

	private String truckNumber;

	private String trailer;

	private StatusEnum status;

	private String orderDispatchNumber;

	private TypeCompanyEnum typeCompanyEnum;

	public TypeCompanyEnum getTypeCompanyEnum() {
		return typeCompanyEnum;
	}

	public void setTypeCompanyEnum(TypeCompanyEnum typeCompanyEnum) {
		this.typeCompanyEnum = typeCompanyEnum;
	}

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

	public String getOrderDispatchNumber() {
		return orderDispatchNumber;
	}

	public void setOrderDispatchNumber(String orderDispatchNumber) {
		this.orderDispatchNumber = orderDispatchNumber;
	}
}
