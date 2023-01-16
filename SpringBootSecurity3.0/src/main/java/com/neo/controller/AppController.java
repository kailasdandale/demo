package com.neo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neo.model.UserInfo;
import com.neo.service.UserInfoService;

@RestController
@RequestMapping("/api")
public class AppController {

	@Autowired
	private UserInfoService infoService;

	@GetMapping("/welcome")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public String greeting() {
		return "hello";
	}

	@GetMapping("/adm")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public String adminAccessDemo() {

		return "hey you are Authorised !!";
	}

	@GetMapping("/all")
	public String getAll() {
		return "welcome to our world";
	}

	@PostMapping("/create")
	public UserInfo createNewUser(@RequestBody UserInfo userInfo) {
		return infoService.createNewUser(userInfo);
	}

}
