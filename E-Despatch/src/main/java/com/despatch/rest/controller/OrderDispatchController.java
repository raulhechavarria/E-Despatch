package com.despatch.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.despatch.rest.request.OrderDispatchRequest;
import com.despatch.service.OrderDispatchService;
import com.despatch.service.dto.OrderDispatchDto;

@RestController
public class OrderDispatchController {

	@Autowired
	OrderDispatchService orderDispatchService;

	@GetMapping(name = "/orderDispatch")
	public @ResponseBody OrderDispatchDto getOrderDispatchById(Long id) {
		return orderDispatchService.getOrderDispatchById(id);
	}
	/*
	 * @GetMapping(name = "/orderDispatch") public @ResponseBody OrderDispatchDto
	 * getByOrderDispatchNumber(@RequestParam String orderDispatchNumber, @RequestParam
	 * TypeCompanyEnum typeCompanyEnum) { return
	 * orderDispatchService.getByOrderDispatchNumber(orderDispatchNumber,typeCompanyEnum); }
	 */

	@PostMapping(name = "/orderDispatch")
	public @ResponseBody OrderDispatchDto saveOrderDispatch(@RequestBody OrderDispatchRequest orderDispatchRequest) {
		return orderDispatchService.save(orderDispatchRequest);
	}
	
	@PutMapping(name = "/orderDispatch")
	public @ResponseBody OrderDispatchDto updateOrderDispatch(@RequestBody OrderDispatchRequest orderDispatchRequest) {
		return orderDispatchService.update(orderDispatchRequest);
	}
}
