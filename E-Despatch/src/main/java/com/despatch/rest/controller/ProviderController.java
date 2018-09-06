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

import com.despatch.rest.request.ProviderRequest;
import com.despatch.service.ProviderService;
import com.despatch.service.dto.ProviderDto;

@RestController
public class ProviderController {

	@Autowired
	ProviderService providerService;
	
	@PostMapping(value = "/provider")
	public @ResponseBody ProviderDto saveProvider(@RequestBody ProviderRequest providerRequest) {
		return providerService.save(providerRequest);
	}
	
	@GetMapping(value = "/provider")
	public @ResponseBody List<ProviderDto> getProvider() {
		return providerService.findAll();
	}

	@DeleteMapping(value = "/provider/{id}")
	public @ResponseBody Boolean deleteProvider(@PathVariable Long id) {
		return providerService.deleteProvider(id);
	}

	@PutMapping(value = "/provider")
	public @ResponseBody ProviderDto updateProvider(@RequestBody ProviderRequest providerRequest) {
		return providerService.updateProvider(providerRequest);
	}
}
