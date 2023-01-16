package com.neo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.neo.model.UserInfo;
import com.neo.repository.UserRepo;
@Component
public class UserInfoDetailsService implements UserDetailsService {

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
	Optional<UserInfo>userInfo=	userRepo.findByName(username);
		System.out.println(userInfo.get());
	return userInfo
			.map(UserInfoDto::new)
	        .orElseThrow(()->
	        new UsernameNotFoundException("user Not found"));
	
	}

}
