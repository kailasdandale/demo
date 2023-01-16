 package com.neo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.neo.model.Person;
import com.neo.service.PersonService;

@RestController
public class AppController {

	
	@Autowired
	private PersonService personService;
	
	@PostMapping("/person")
	public Person createPersonData(@RequestBody Person person) {
		
		return personService.save(person);
	}
	
	@PutMapping("/{id}")
	public  Person UpdatePersonData(@RequestBody Person p,@PathVariable int id) {
		
		return personService.uodateData(p,id);
	}
}
