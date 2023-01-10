package com.neo.controller;

import java.util.Comparator;
import java.util.List;
 import java.util.stream.Collectors;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neo.exception.UserNotFoundExc;
import com.neo.model.User1;
import com.neo.repository.UserRepo;

@Service
public class User1Service {

	@Autowired
	private UserRepo repo;

	public User1 createUser1(User1 user1) {
		if (repo.findByEmail(user1.getEmail()).isPresent())
			throw new UserNotFoundExc("Email is already exists " 
		                              + " Please enter another EmailId");
		else
			return repo.save(user1);
	}

	public User1 getUser(int id) {
		if (repo.findById(id).isPresent()) {
			return repo.findById(id).get();
		}
		throw new UserNotFoundExc(" OOPS !! Not Found !");

	}

	public User1 updateUserDetails(User1 user1, int id) {
		if (repo.findById(id).isPresent()) {
			User1 u = repo.findById(id).get();

			if (user1.getName() != null) {
				u.setName(user1.getName());
			}
			if (user1.getEmail() != null) {
				u.setEmail(user1.getEmail());
			}
			if (user1.getMobilenmber() != null) {
				u.setMobilenmber(user1.getMobilenmber());
			}
			if (user1.getDateofbirth() != null) {
				u.setDateofbirth(user1.getDateofbirth());
			}
			return repo.save(u);
		}
		throw new UserNotFoundExc(" OOPS !! Not Found !");

	}

	public List<User1> getAllUser() {
		/*
		  Map<String, List<User1>> collect = repo.findAll().stream()
		  .collect(Collectors .groupingBy(User1::getEmail,Collectors.toList()));
		 */
		return repo.findAll()
				.stream()
				.sorted(Comparator.comparing(User1::getName))
				.collect(Collectors.toList());
	}

	public String deleteUser(int id) {
		if (repo.findById(id).isPresent()) {
			repo.deleteById(id);
			return "deleted Successfully";
		}
		throw new UserNotFoundExc("  deleted data Not present !");
	}

	public User1 getUserByEmail(String email) {
		
		if(repo.findByEmail(email).isPresent()) {
		
			return repo.findByEmail(email).get();
		}
		
		throw new UserNotFoundExc("OOps!! Not found !!! "+email+ 
				" Please Enter valid Email !!");
	}

}
