package com.despatch.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.despatch.entity.company.Customer;
import com.despatch.repository.CustomerRepository;
import com.despatch.rest.request.CustomerRequest;
import com.despatch.service.CustomerService;
import com.despatch.service.dto.CustomerDto;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public CustomerDto save(CustomerRequest customerRequest) {
		Customer customer = new Customer();
		customer.setAddress(customerRequest.getAddress());
		customer.setName(customerRequest.getName());
		customer = customerRepository.save(customer);

		CustomerDto customerDto = new CustomerDto();
		customerDto.setAddress(customer.getAddress());
		customerDto.setName(customer.getName());
		customerDto.setId(customer.getId());
		return customerDto;
	}

	@Override
	public List<CustomerDto> findAll() {
		List<Customer> customers = new ArrayList<>();
		List<CustomerDto> dtos = new ArrayList<>();
		customers = (List<Customer>) customerRepository.findAll();

		customers.forEach(c -> {
			CustomerDto customerDto = new CustomerDto();
			customerDto.setAddress(c.getAddress());
			customerDto.setName(c.getName());
			customerDto.setId(c.getId());
			dtos.add(customerDto);
		});
		return dtos;
	}

	@Override
	public Boolean deleteCustomer(Long id) {
		try {
			customerRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public CustomerDto updateCustomer(CustomerRequest customerRequest) {
		Customer customer = new Customer();
		customer.setAddress(customerRequest.getAddress());
		customer.setName(customerRequest.getName());
		customer.setId(customer.getId());
		customer = customerRepository.save(customer);

		CustomerDto customerDto = new CustomerDto();
		customerDto.setAddress(customer.getAddress());
		customerDto.setName(customer.getName());
		customerDto.setId(customer.getId());
		return customerDto;
	}

	@Override
	public CustomerDto findCustomerById(Long id) {
		Customer customer = customerRepository.findById(id).get();
		CustomerDto customerDto = new CustomerDto();
		customerDto.setAddress(customer.getAddress());
		customerDto.setName(customer.getName());
		customerDto.setId(customer.getId());
		return customerDto;
	}

}
