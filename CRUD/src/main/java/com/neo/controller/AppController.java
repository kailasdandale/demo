package com.neo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.neo.model.User1;

@RestController
public class AppController {
	@Autowired
	private User1Service service;

	@GetMapping("/")
	public String greeting() {
		return "hello";
	}
	@PostMapping("/create")
	public ResponseEntity<User1>createUser(@Valid @RequestBody User1 user1){
		
		return new ResponseEntity<User1>
		
		(service.createUser1(user1),HttpStatus.ACCEPTED);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User1>getUser(@PathVariable("id")int id){
		
		return new ResponseEntity<User1>(service.getUser(id),HttpStatus.OK);
	}
	
	@PutMapping(value = "/update/{id}")
	public ResponseEntity<User1>updateUserDeatils(@RequestBody User1 user1,
			@PathVariable int id){
		return new ResponseEntity<User1>
		       (service.updateUserDetails(user1,id),HttpStatus.ACCEPTED);
	}
	
	@GetMapping(value = "/allusers")
	public ResponseEntity<List<User1>>getAllUsers(){
		
		return new ResponseEntity<List<User1>>
		(service.getAllUser(),HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<?>deleteUser(@PathVariable int id){
		
		return new ResponseEntity<String>(service.deleteUser(id),HttpStatus.OK);
				
	}
	
	@GetMapping(value = "/email/{email}")
	public ResponseEntity<?>getUserByEmail(@PathVariable String email){
		
		return new 
				ResponseEntity<User1>(service.getUserByEmail(email),HttpStatus.OK);
	}
}
