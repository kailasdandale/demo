package com.neo.soft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neo.soft.model.User;
import com.neo.soft.repository.UserRepostory;
import com.neo.soft.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/user")

public class UserController {

	@Autowired
	private UserRepostory userrepo;

	@Autowired
	private UserService userService;

	@PostMapping("/save")
	public User addUser(@RequestBody User user) {

		return userrepo.save(user);
	}

	@GetMapping("/getUser/{userId}")
	public User getUser(@PathVariable("userId") int userId) {

		// logger.info
		return userService.getUser(userId);

	}

}
