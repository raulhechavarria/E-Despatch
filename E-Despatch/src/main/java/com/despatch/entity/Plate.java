package com.despatch.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.despatch.entity.company.DeliveryTruck;

@Entity
@Table(name = "plate")
public class Plate {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long Id;

	@Column(name = "number")
	private String number;

	@ManyToOne
	@JoinColumn(name = "deliveryTruck_id", nullable = true)
	private DeliveryTruck deliveryTruck;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public DeliveryTruck getDeliveryTruck() {
		return deliveryTruck;
	}

	public void setDeliveryTruck(DeliveryTruck deliveryTruck) {
		this.deliveryTruck = deliveryTruck;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
