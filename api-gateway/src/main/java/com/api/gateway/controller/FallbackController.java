package com.api.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {


	@GetMapping("/phonebookFallback")
	public String phonebookFallback() {
		
		return "PhoneBook service is down at this time!!!!";
	}
	
	@GetMapping("/userServiceFallback")
	public String userServiceFallback() {
		
		return "User service is down at this time!!!!";
	}
}
