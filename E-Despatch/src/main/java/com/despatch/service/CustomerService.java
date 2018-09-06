package com.despatch.service;

import java.util.List;

import com.despatch.rest.request.CustomerRequest;
import com.despatch.service.dto.CustomerDto;

public interface CustomerService {

	CustomerDto save(CustomerRequest customerRequest);

	List<CustomerDto> findAll();

	Boolean deleteCustomer(Long id);

	CustomerDto updateCustomer(CustomerRequest customerRequest);

}
