package com.despatch.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.despatch.rest.request.CustomerRequest;
import com.despatch.service.CustomerService;
import com.despatch.service.dto.CustomerDto;

@RestController
@RequestMapping("customer")
@CrossOrigin(maxAge = 3600)
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@PostMapping
	public @ResponseBody CustomerDto saveCustomer(@RequestBody CustomerRequest customerRequest) {
		return customerService.save(customerRequest);
	}

	@GetMapping
	public @ResponseBody List<CustomerDto> getCustomers() {
		return customerService.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public @ResponseBody CustomerDto getCustomer(@PathVariable Long id) {
		return customerService.findCustomerById(id);
	}


	@DeleteMapping(value = "/{id}")
	public @ResponseBody Boolean deleteCustomer(@PathVariable Long id) {
		return customerService.deleteCustomer(id);
	}

	@PutMapping
	public @ResponseBody CustomerDto updateCustomer(@RequestBody CustomerRequest customerRequest) {
		return customerService.updateCustomer(customerRequest);
	}
}
