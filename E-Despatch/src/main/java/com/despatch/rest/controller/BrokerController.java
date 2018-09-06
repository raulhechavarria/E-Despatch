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

import com.despatch.rest.request.BrokerRequest;
import com.despatch.rest.request.BrokerRequest;
import com.despatch.service.BrokerService;
import com.despatch.service.dto.BrokerDto;
import com.despatch.service.dto.BrokerDto;

@RestController
public class BrokerController {

	@Autowired
	BrokerService brokerService;
	
	@PostMapping(value = "/broker")
	public @ResponseBody BrokerDto saveBroker(@RequestBody BrokerRequest brokerRequest) {
		return brokerService.save(brokerRequest);
	}
	
	@GetMapping(value = "/broker")
	public @ResponseBody List<BrokerDto> getBroker() {
		return brokerService.findAll();
	}

	@DeleteMapping(value = "/broker/{id}")
	public @ResponseBody Boolean deleteBroker(@PathVariable Long id) {
		return brokerService.deleteBroker(id);
	}

	@PutMapping(value = "/broker")
	public @ResponseBody BrokerDto updateBroker(@RequestBody BrokerRequest brokerRequest) {
		return brokerService.updateBroker(brokerRequest);
	}
}
