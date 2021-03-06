package com.despatch.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.despatch.entity.company.Broker;
import com.despatch.entity.company.Customer;
import com.despatch.entity.company.Provider;
import com.despatch.entity.enumerator.StatuEnumCustomer;
import com.despatch.entity.enumerator.StatuEnumProvider;
import com.despatch.entity.enumerator.StatusEnum;
import com.despatch.entity.enumerator.StatusEnumDeliveryTruck;

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
	
	@Column(name = "statusDeliveryTruck")
	private StatusEnumDeliveryTruck statusDeliveryTruck;
	
	@Column(name = "statuEnumCustomer")
	private StatuEnumCustomer statuEnumCustomer;
	
	@Column(name = "statuEnumProvider")
	private StatuEnumProvider statuEnumProvider;

	@Column(name = "orderDispatchNumber")
	private String orderDispatchNumber;
	
	@ManyToOne
	@JoinColumn(name = "customer_id", nullable = true)
	private Customer customer;
	
	@ManyToOne
	@JoinColumn(name = "broker_id", nullable = true)	
	private Broker broker;
	
	@ManyToOne
	@JoinColumn(name = "provider_id", nullable = true)	
	private Provider provider;
	
	@Column(name = "dateCreate")
	private Date dateCreate;
	
	@Column(name = "datePickup")
	private Date datePickup;
	
	@Column(name = "dateDelivery")
	private Date dateDelivery;
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Broker getBroker() {
		return broker;
	}

	public void setBroker(Broker broker) {
		this.broker = broker;
	}

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
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

	public StatusEnumDeliveryTruck getStatusDeliveryTruck() {
		return statusDeliveryTruck;
	}

	public void setStatusDeliveryTruck(StatusEnumDeliveryTruck statusDeliveryTruck) {
		this.statusDeliveryTruck = statusDeliveryTruck;
	}

	public StatuEnumCustomer getStatuEnumCustomer() {
		return statuEnumCustomer;
	}

	public void setStatuEnumCustomer(StatuEnumCustomer statuEnumCustomer) {
		this.statuEnumCustomer = statuEnumCustomer;
	}

	public StatuEnumProvider getStatuEnumProvider() {
		return statuEnumProvider;
	}

	public void setStatuEnumProvider(StatuEnumProvider statuEnumProvider) {
		this.statuEnumProvider = statuEnumProvider;
	}

	public Date getDateCreate() {
		return dateCreate;
	}

	public void setDateCreate(Date dateCreate) {
		this.dateCreate = dateCreate;
	}

	public Date getDatePickup() {
		return datePickup;
	}

	public void setDatePickup(Date datePickup) {
		this.datePickup = datePickup;
	}

	public Date getDateDelivery() {
		return dateDelivery;
	}

	public void setDateDelivery(Date dateDelivery) {
		this.dateDelivery = dateDelivery;
	}

	
}
