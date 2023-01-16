package com.neo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.neo.model.UserInfo;
import com.neo.repository.UserRepo;

@Service
public class UserInfoService {

	@Autowired
	private UserRepo repo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public UserInfo createNewUser(UserInfo userInfo) {
		
		userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
		
		return repo.save(userInfo);
	}
	
	
	
}
