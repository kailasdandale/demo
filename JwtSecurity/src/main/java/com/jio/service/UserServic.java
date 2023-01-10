package com.jio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jio.model.User;
import com.jio.repository.UserRepository;

@Service
public class UserServic {

	@Autowired
	private UserRepository repository;

	public User addUser(User user) {

		return repository.save(user);
	}
}
