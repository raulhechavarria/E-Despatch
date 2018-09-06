package com.despatch.service;

import java.util.List;

import com.despatch.rest.request.BrokerRequest;
import com.despatch.service.dto.BrokerDto;

public interface BrokerService {

	BrokerDto save(BrokerRequest brokerRequest);

	List<BrokerDto> findAll();

	Boolean deleteBroker(Long id);

	BrokerDto updateBroker(BrokerRequest brokerRequest);

}
