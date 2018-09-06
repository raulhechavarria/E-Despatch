package com.despatch.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.despatch.entity.company.Provider;
import com.despatch.repository.ProviderRepository;
import com.despatch.rest.request.ProviderRequest;
import com.despatch.service.ProviderService;
import com.despatch.service.dto.ProviderDto;
@Service
public class ProviderServiceImpl implements ProviderService {

	@Autowired
	ProviderRepository providerRepository;
	
	@Override
	public ProviderDto save(ProviderRequest providerRequest) {
		Provider provider = new Provider();
		provider.setAddress(providerRequest.getAddress());
		provider.setName(providerRequest.getName());
	    provider = providerRepository.save(provider);
	    
	    ProviderDto providerDto = new ProviderDto();
	    providerDto.setAddress(provider.getAddress());
		providerDto.setName(provider.getName());
	    providerDto.setId(provider.getId());
		return  providerDto;
	}

	@Override
	public List<ProviderDto> findAll() {
		List<Provider> providers = new ArrayList<>();
		List<ProviderDto> dtos = new ArrayList<>();
		providers = (List<Provider>) providerRepository.findAll();

		providers.forEach(c -> {
			ProviderDto dto = new ProviderDto();
			dto.setAddress(c.getAddress());
			dto.setName(c.getName());
			dto.setId(c.getId());
			dtos.add(dto);
		});
		return dtos;
	}

	@Override
	public Boolean deleteProvider(Long id) {
		try {
			providerRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public ProviderDto updateProvider(ProviderRequest providerRequest) {
		Provider provider = new Provider();
		provider.setAddress(providerRequest.getAddress());
		provider.setName(providerRequest.getName());
		provider.setId(provider.getId());
		provider = providerRepository.save(provider);
	    
	    ProviderDto providerDto = new ProviderDto();
	    providerDto.setAddress(provider.getAddress());
		providerDto.setName(provider.getName());
	    providerDto.setId(provider.getId());
		return  providerDto;
	}

	
}
