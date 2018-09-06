package com.despatch.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.despatch.entity.OrderDispatch;
import com.despatch.entity.enumerator.StatusEnum;
import com.despatch.entity.enumerator.TypeCompanyEnum;
import com.despatch.repository.OrderDispatchRepository;
import com.despatch.rest.request.OrderDispatchRequest;
import com.despatch.service.OrderDispatchService;
import com.despatch.service.dto.OrderDispatchDto;

@Service
public class OrderDispatchServiceImpl implements OrderDispatchService {

	@Autowired
	OrderDispatchRepository orderDispatchRepository;

	@Override
	public OrderDispatchDto getOrderDispatchById(Long id) {
		OrderDispatch orderDispatch = orderDispatchRepository.findById(id).get();
		OrderDispatchDto dto = new OrderDispatchDto(orderDispatch.getId(), orderDispatch.getTruckNumber(), orderDispatch.getTrailer(), orderDispatch.getStatus(),
				orderDispatch.getOrderDispatchNumber());
		return dto;
	}

	@Override
	public OrderDispatchDto getByOrderDispatchNumber(String orderDispatchNumber, TypeCompanyEnum typeCompanyEnum) {
		if (typeCompanyEnum.equals(TypeCompanyEnum.truckDriver)) { // need analize in this step
			OrderDispatch orderDispatch = orderDispatchRepository.findOrderDispatchByOrderDispatchNumber(orderDispatchNumber);
			OrderDispatchDto dto = new OrderDispatchDto(orderDispatch.getId(), orderDispatch.getTruckNumber(), orderDispatch.getTrailer(), orderDispatch.getStatus(),
					orderDispatch.getOrderDispatchNumber());
			return dto;
		} else {
			return null;
		}

	}

	@Override
	public OrderDispatchDto save(OrderDispatchRequest orderDispatchRequest) {
		if (orderDispatchRequest.getTypeCompanyEnum().equals(TypeCompanyEnum.broker)) {
			OrderDispatch orderDispatch = new OrderDispatch();
			orderDispatch.setOrderDispatchNumber(null);
			orderDispatch.setStatus(StatusEnum.created);
			orderDispatch.setTrailer(orderDispatchRequest.getTrailer());
			orderDispatch.setTruckNumber(orderDispatchRequest.getTruckNumber());
			orderDispatch = orderDispatchRepository.save(orderDispatch);
			
			orderDispatch.setOrderDispatchNumber(null);
			orderDispatch = orderDispatchRepository.save(orderDispatch);			
			
			OrderDispatchDto dto = new OrderDispatchDto(orderDispatch.getId(), orderDispatch.getTruckNumber(), orderDispatch.getTrailer(), orderDispatch.getStatus(),
					orderDispatch.getOrderDispatchNumber());
			return dto;
		} else {
			return null;
		}
	}

	@Override
	public OrderDispatchDto update(OrderDispatchRequest orderDispatchRequest) {
		OrderDispatch orderDispatch = new OrderDispatch();
		orderDispatch.setStatus(StatusEnum.created);
		orderDispatch.setTrailer(orderDispatchRequest.getTrailer());
		orderDispatch.setTruckNumber(orderDispatchRequest.getTruckNumber());
	    orderDispatch.setId(orderDispatchRequest.getId());
		orderDispatch = orderDispatchRepository.save(orderDispatch);
		
		
		OrderDispatchDto dto = new OrderDispatchDto(orderDispatch.getId(), orderDispatch.getTruckNumber(), orderDispatch.getTrailer(), orderDispatch.getStatus(),
				orderDispatch.getOrderDispatchNumber());
		
		return dto;
	}

}
