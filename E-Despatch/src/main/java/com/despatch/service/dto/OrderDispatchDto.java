package com.despatch.service.dto;

import com.despatch.entity.enumerator.StatusEnum;

public class OrderDispatchDto {
	
	private Long id;

	private String truckNumber;

	private String trailer;

	private StatusEnum status;

	private String orderDispatchNumber;

	public OrderDispatchDto(Long id, String truckNumber, String trailer, StatusEnum status, String orderDispatchNumber) {
		super();
		this.id = id;
		this.truckNumber = truckNumber;
		this.trailer = trailer;
		this.status = status;
		this.orderDispatchNumber = orderDispatchNumber;
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
