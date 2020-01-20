package com.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.config.Configuration;
import com.learn.model.LimitsConfiguration;


@RestController
public class LimitServicesController {

//	@Value("${limit-services.maximum}")
//	int max;
//	@Value("${limit-services.minimum}")
//	int min;
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitsConfiguration fetchLimitConfig() {
		return new LimitsConfiguration(configuration.getMinimum(), configuration.getMaximum());
	}
}
