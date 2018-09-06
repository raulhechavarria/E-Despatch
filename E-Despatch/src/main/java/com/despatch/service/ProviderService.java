package com.despatch.service;

import java.util.List;

import com.despatch.rest.request.ProviderRequest;
import com.despatch.service.dto.ProviderDto;

public interface ProviderService {

	ProviderDto save(ProviderRequest providerRequest);

	List<ProviderDto> findAll();

	Boolean deleteProvider(Long id);

	ProviderDto updateProvider(ProviderRequest providerRequest);

}
