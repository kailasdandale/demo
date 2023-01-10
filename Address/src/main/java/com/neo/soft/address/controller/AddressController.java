package com.neo.soft.address.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neo.soft.address.model.Address;
import com.neo.soft.address.repository.AddressRepositoty;

@RestController
@RequestMapping("/address")
public class AddressController {

	@Autowired
	private AddressRepositoty addressRepositoty;

	@PostMapping("/saveaddress")
	public Address addAddress(@RequestBody Address address) {

		return addressRepositoty.save(address);
	}

	@GetMapping("/get/{userId}")
	public List<Address> getaddress(@PathVariable("userId") int userId) {

		return addressRepositoty.findByUserId(userId);
	}

}
