package com.despatch.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.despatch.rest.request.CustomerRequest;
import com.despatch.service.CustomerService;
import com.despatch.service.dto.CustomerDto;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping(value = "/customer")
	public @ResponseBody CustomerDto saveCustomer(@RequestBody CustomerRequest customerRequest) {
		return customerService.save(customerRequest);
	}
	
	@GetMapping(value = "/customer")
	public @ResponseBody List<CustomerDto> getCustomer() {
		return customerService.findAll();
	}
}
