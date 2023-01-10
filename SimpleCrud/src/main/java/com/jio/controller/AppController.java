package com.jio.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jio.entity.User;
import com.jio.service.UserService;

@RestController
public class AppController {

	
	@GetMapping(value = "/hello")
	public String greating() {
		return "Hello";
	}
	
	@Autowired
	private UserService userservice;
	
	@PostMapping(value = "/addUser")
	public ResponseEntity<User>addNewUser(@Valid @RequestBody User user){
		
		System.out.println("aaa");
	return new ResponseEntity<User>(userservice.addNewUser(user),HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/{email}")
	public ResponseEntity<User>getUser(@PathVariable("email") String email){
		
		return new ResponseEntity<User>(userservice.getUser(email),HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<User>updateUser(@PathVariable int id,
			@RequestBody User user){
		
		return new ResponseEntity<User>(userservice.updateUser(id,user),HttpStatus.ACCEPTED);
		
	}
}
