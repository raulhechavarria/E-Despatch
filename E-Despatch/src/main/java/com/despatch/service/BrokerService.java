package com.despatch.service;

import com.despatch.rest.request.BrokerRequest;
import com.despatch.service.dto.BrokerDto;

public interface BrokerService {

	BrokerDto save(BrokerRequest brokerRequest);

}
