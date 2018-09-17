package com.despatch.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.despatch.entity.company.Broker;
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

	@Override
	public List<BrokerDto> findAll() {
		List<Broker> brokers = new ArrayList<>();
		List<BrokerDto> dtos = new ArrayList<>();
		brokers = (List<Broker>) brokerRepository.findAll();

		brokers.forEach(c -> {
			BrokerDto dto = new BrokerDto();
			dto.setAddress(c.getAddress());
			dto.setName(c.getName());
			dto.setId(c.getId());
			dtos.add(dto);
		});
		return dtos;
	}

	@Override
	public Boolean deleteBroker(Long id) {
		try {
			brokerRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public BrokerDto updateBroker(BrokerRequest brokerRequest) {
		Broker broker = new Broker();
		broker.setAddress(brokerRequest.getAddress());
		broker.setContactName(brokerRequest.getContactName());
		broker.setName(brokerRequest.getName());
		broker.setId(broker.getId());
		broker = brokerRepository.save(broker);
	    
	    BrokerDto brokerDto = new BrokerDto();
	    brokerDto.setAddress(broker.getAddress());
		brokerDto.setContactName(broker.getContactName());
		brokerDto.setName(broker.getName());
	    brokerDto.setId(broker.getId());
		return  brokerDto;
	}

	
}
