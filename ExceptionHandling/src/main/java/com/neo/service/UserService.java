package com.neo.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neo.exception.UserNotFound;
import com.neo.model.User2;
import com.neo.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo repo;

	public User2 createUser(User2 user2) {

		if(repo.findByEmail(user2.getEmail()).isPresent())
		throw new UserNotFound("User is already exist !!");
		
		return repo.save(user2);
	}

	public User2 getUser(int id) {

		if (repo.findById(id).isPresent()) {

			return repo.findById(id).get();
		}
		throw new UserNotFound("Not found !!");
	}

	public List<User2> getAll() {

		return 
			  repo.findAll()
				.stream()
				.sorted(Comparator.comparing(User2::getAge))
				.collect(Collectors.toList());

	}

}
