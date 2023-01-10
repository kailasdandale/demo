package com.jio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jio.model.User;
import com.jio.service.UserServic;

@RestController
public class AppController {

	@Autowired
	private UserServic servic;

	@PostMapping(value = "/add")
	public ResponseEntity<User>addUser(@RequestBody User user){
		
		return new ResponseEntity<User>(servic.addUser(user),HttpStatus.ACCEPTED);
		
	}

}
