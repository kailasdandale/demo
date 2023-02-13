package com.neo.service;

import com.neo.dto.UserDto;
import com.neo.eitity.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;

public interface UserService {
	Mono<Void> deleteById(int id);

	Mono<UserDto> updateUser(int id, User user);

	Mono<Void> deleteByFirstName(String firstName);

	Flux<UserDto> getAllUsers();

	Mono<UserDto> createUser(User userDto);

	Mono<User> getUser(int id);

	Mono<UserDto> activateUser(int id, User user);

	Mono<UserDto> getDataById(int id);
}
