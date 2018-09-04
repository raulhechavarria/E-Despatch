package com.despatch.service;

import com.despatch.entity.enumerator.TypeCompanyEnum;
import com.despatch.rest.request.OrderDispatchRequest;
import com.despatch.service.dto.OrderDispatchDto;

public interface OrderDispatchService {

	OrderDispatchDto getOrderDispatchById(Long id);

	OrderDispatchDto getByOrderDispatchNumber(String orderDispatchNumber, TypeCompanyEnum typeCompanyEnum);

	OrderDispatchDto save(OrderDispatchRequest orderDispatchRequest);


}
