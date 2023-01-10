package com.jio.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jio.entity.User;
import com.jio.exception.UserNotFound;
import com.jio.repository.userRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private userRepo userrepo;

	@Override
	public User addNewUser(User user) {

		if (userrepo.findByEmail(user.getEmail()).isPresent())
			throw new UserNotFound("User already exists");
		else {
			return userrepo.save(user);

		}
	}

	@Override
	public User getUser(String email) {
		if (userrepo.findByEmail(email).isPresent()) {
			return userrepo.findByEmail(email).get();
		}
		throw new UserNotFound("Not found");
	}

	@Override
	public User updateUser(int id, User user) {
	
		if(userrepo.findById(id).isPresent()) {
			User u = userrepo.findById(id).get();
			
			if(user.getName()!=null) {
				u.setName(user.getName());
			}
			if(user.getEmail()!=null) {
				u.setEmail(user.getEmail());
			}
			if(user.getMobileNumber()!=null) {
				u.setMobileNumber(user.getMobileNumber());
			}
			if(user.getAge()!=0) {
				u.setAge(user.getAge());
			}
			return userrepo.save(u);	
		}
		
		throw new UserNotFound("User not found !!");
	}

}
