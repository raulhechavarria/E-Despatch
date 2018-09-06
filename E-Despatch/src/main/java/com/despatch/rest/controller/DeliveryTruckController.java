package com.despatch.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.despatch.rest.request.DeliveryTruckRequest;
import com.despatch.rest.request.DeliveryTruckRequest;
import com.despatch.service.DeliveryTruckService;
import com.despatch.service.dto.DeliveryTruckDto;
import com.despatch.service.dto.DeliveryTruckDto;

@RestController
public class DeliveryTruckController {

	@Autowired
	DeliveryTruckService deliveryTruckService;
	
	@PostMapping(value = "/deliveryTruck")
	public @ResponseBody DeliveryTruckDto saveDeliveryTruck(@RequestBody DeliveryTruckRequest celiveryTruckRequest) {
		return deliveryTruckService.save(celiveryTruckRequest);
	}
	
	@GetMapping(value = "/deliveryTruck")
	public @ResponseBody List<DeliveryTruckDto> getDeliveryTruck() {
		return deliveryTruckService.findAll();
	}

	@DeleteMapping(value = "/deliveryTruck/{id}")
	public @ResponseBody Boolean deleteDeliveryTruck(@PathVariable Long id) {
		return deliveryTruckService.deleteDeliveryTruck(id);
	}

	@PutMapping(value = "/deliveryTruck")
	public @ResponseBody DeliveryTruckDto updateDeliveryTruck(@RequestBody DeliveryTruckRequest deliveryTruckRequest) {
		return deliveryTruckService.updateDeliveryTruck(deliveryTruckRequest);
	}
}
