package com.despatch.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.despatch.rest.request.BrokerRequest;
import com.despatch.service.BrokerService;
import com.despatch.service.dto.BrokerDto;

@RestController
public class BrokerController {

	@Autowired
	BrokerService brokerService;
	
	@PostMapping(value = "/broker")
	public @ResponseBody BrokerDto saveBroker(@RequestBody BrokerRequest brokerRequest) {
		return brokerService.save(brokerRequest);
	}
}
