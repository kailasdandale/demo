package com.neo.soft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.neo.soft.config.UserClient;
import com.neo.soft.model.Address;
import com.neo.soft.model.User;
import com.neo.soft.repository.UserRepostory;

@Service
public class UserService {

	@Autowired
	private UserRepostory userRepostory;
	@Autowired
	private UserClient userClient;

	/*
	 * @Autowired private RestTemplate restTemplate;
	 */

	

	@SuppressWarnings("deprecation")
	public User getUser(int userId) {

		User user = userRepostory.getById(userId);
		List<Address> add = userClient.getaddress(userId);

		// List l = restTemplate.getForObject("http://localhost:9091/get/"+userId+"",
		// List<Address>.class);
		System.out.println(user);
		System.out.println(add);
		//for (Address address : add) {
			user.setAddress(add);
		
		
		return user;

	}

}
