package com.despatch.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.despatch.entity.Broker;
import com.despatch.repository.BrokerRepository;
import com.despatch.rest.request.BrokerRequest;
import com.despatch.service.BrokerService;
import com.despatch.service.dto.BrokerDto;
@Service
public class BrokerServiceImpl implements BrokerService {

	@Autowired
	BrokerRepository brokerRepository;
	
	@Override
	public BrokerDto save(BrokerRequest brokerRequest) {
		Broker broker = new Broker();
		broker.setAddress(brokerRequest.getAddress());
		broker.setContactName(brokerRequest.getContactName());
		broker.setName(brokerRequest.getName());
	    broker = brokerRepository.save(broker);
	    
	    BrokerDto brokerDto = new BrokerDto();
	    brokerDto.setAddress(broker.getAddress());
		brokerDto.setContactName(broker.getContactName());
		brokerDto.setName(broker.getName());
	    brokerDto.setId(broker.getId());
		return  brokerDto;
	}

	
}
