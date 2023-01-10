package com.neo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neo.model.User2;
import com.neo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping
	public ResponseEntity<User2>createUser(@RequestBody User2 user2){
		
		return new ResponseEntity<User2>
		(service.createUser(user2),HttpStatus.CREATED);
	}
	@GetMapping("/{id}")
	public ResponseEntity<User2>getUser(@PathVariable int id){
		
		return new ResponseEntity<User2>(service.getUser(id),HttpStatus.OK);
		
	}
	
	@GetMapping()
	public ResponseEntity<List<User2>>getAllUsers(){
		
		return new
				ResponseEntity<List<User2>>(service.getAll(), HttpStatus.OK);
	}
	
	
}
