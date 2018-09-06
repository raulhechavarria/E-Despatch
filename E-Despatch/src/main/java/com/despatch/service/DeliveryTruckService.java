package com.despatch.service;

import java.util.List;

import com.despatch.rest.request.DeliveryTruckRequest;
import com.despatch.service.dto.DeliveryTruckDto;

public interface DeliveryTruckService {

	DeliveryTruckDto save(DeliveryTruckRequest deliveryTruckRequest);

	List<DeliveryTruckDto> findAll();

	Boolean deleteDeliveryTruck(Long id);

	DeliveryTruckDto updateDeliveryTruck(DeliveryTruckRequest deliveryTruckRequest);

}
