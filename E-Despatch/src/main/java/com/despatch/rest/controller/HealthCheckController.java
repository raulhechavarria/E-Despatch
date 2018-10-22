package com.despatch.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.despatch.service.impl.HealthCheck;

@RestController
public class HealthCheckController {

	@Autowired
	HealthCheck healthCheck;
	// HealthIndicator healthIndicator;

	@GetMapping("/health")
	public @ResponseBody Health getHealth() {
		Health health = healthCheck.health();
		return health;
	}

}
