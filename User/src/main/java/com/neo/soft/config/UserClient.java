package com.neo.soft.config;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.neo.soft.model.Address;

@FeignClient(name = "ADDRESS",path = "/address")
public interface UserClient {

	// url = "http://localhost:9091/address"
	
	@GetMapping("/get/{userId}")
	public List<Address> getaddress(@PathVariable int userId);
}
	