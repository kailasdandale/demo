package com.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

	@GetMapping("/userservicefail")
	public String userServiceFaill() {
		return "user service down !!";
	}
	@GetMapping("/addressservicefail")

	public String addressServiceFaill() {
		return "address service down !!";
	}
	
}
