package com.jio.service;

import javax.validation.Valid;

import com.jio.entity.User;

public interface UserService {

	User addNewUser(@Valid User user);

	User getUser(String email);

	User updateUser(int id, User user);

}
