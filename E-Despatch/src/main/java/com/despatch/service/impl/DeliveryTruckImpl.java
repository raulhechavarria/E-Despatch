package com.despatch.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.despatch.entity.company.Customer;
import com.despatch.entity.company.DeliveryTruck;
import com.despatch.repository.DeliveryTruckRepository;
import com.despatch.rest.request.DeliveryTruckRequest;
import com.despatch.service.DeliveryTruckService;
import com.despatch.service.dto.CustomerDto;
import com.despatch.service.dto.DeliveryTruckDto;
@Service
public class DeliveryTruckImpl implements DeliveryTruckService {

	@Autowired
	DeliveryTruckRepository deliveryTruckRepository;
	
	@Override
	public DeliveryTruckDto save(DeliveryTruckRequest deliveryTruckRequest) {
		DeliveryTruck deliveryTruck = new DeliveryTruck();
		deliveryTruck.setAddress(deliveryTruckRequest.getAddress());
		deliveryTruck.setName(deliveryTruckRequest.getName());
	    deliveryTruck = deliveryTruckRepository.save(deliveryTruck);
	    
	    DeliveryTruckDto deliveryTruckDto = new DeliveryTruckDto();
	    deliveryTruckDto.setAddress(deliveryTruck.getAddress());
		deliveryTruckDto.setName(deliveryTruck.getName());
	    deliveryTruckDto.setId(deliveryTruck.getId());
		return  deliveryTruckDto;
	}

	@Override
	public List<DeliveryTruckDto> findAll() {
		List<DeliveryTruck> deliveryTrucks = new ArrayList<>();
		List<DeliveryTruckDto> dtos = new ArrayList<>();
		deliveryTrucks = (List<DeliveryTruck>) deliveryTruckRepository.findAll();

		deliveryTrucks.forEach(c -> {
			DeliveryTruckDto dto = new DeliveryTruckDto();
			dto.setAddress(c.getAddress());
			dto.setName(c.getName());
			dto.setId(c.getId());
			dtos.add(dto);
		});
		return dtos;
	}

	@Override
	public Boolean deleteDeliveryTruck(Long id) {
		try {
			deliveryTruckRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public DeliveryTruckDto updateDeliveryTruck(DeliveryTruckRequest deliveryTruckRequest) {
		DeliveryTruck deliveryTruck = new DeliveryTruck();
		deliveryTruck.setAddress(deliveryTruckRequest.getAddress());
		deliveryTruck.setName(deliveryTruckRequest.getName());
		deliveryTruck.setId(deliveryTruck.getId());
	    deliveryTruck = deliveryTruckRepository.save(deliveryTruck);
	    
	    DeliveryTruckDto deliveryTruckDto = new DeliveryTruckDto();
	    deliveryTruckDto.setAddress(deliveryTruck.getAddress());
		deliveryTruckDto.setName(deliveryTruck.getName());
	    deliveryTruckDto.setId(deliveryTruck.getId());
		return  deliveryTruckDto;
	}

	
}
