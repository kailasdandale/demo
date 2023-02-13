package com.neo.controller;

import com.neo.dto.UserDto;
import com.neo.eitity.User;
import com.neo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/users")
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userservice;


    @GetMapping("/hello")
    public Mono<String> greeting() {

        return Mono.just("hello");
    }


    
    @GetMapping("/get/{id}")
    public Mono<UserDto>getDataById(@PathVariable int id){
    	
    	return userservice.getDataById(id);
    }
    
    
    
    
    // get user by id
    @GetMapping(value = "/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Mono<User> getUsers(@PathVariable int id) {
        logger.info("In controller");
        return userservice.getUser(id);

    }

    // create new user
    @PostMapping(value = "/create")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Mono<UserDto> createUser(@RequestBody User userDto) {
        logger.info("in create api" + userDto);
        return userservice.createUser(userDto);
    }

    // get all user
    @GetMapping(value = "")
    @ResponseStatus(code = HttpStatus.OK)
    public Flux<UserDto> getUsersData() {

        logger.info("get all user api function");

        return userservice.getAllUsers();


    }

    // delete user by id
    @DeleteMapping(value = "/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Mono<Void> deleteUser(@PathVariable int id) {
        logger.info("" + id);
        return userservice.deleteById(id);
    }

    // update user//
    @PutMapping(value = "update/{id}")
    public Mono<UserDto> updateUser(@PathVariable int id, @RequestBody User user) {
        logger.info("update api" + id);
        return userservice.updateUser(id, user);
    }

    @PutMapping(value = "activate/{id}")
    public Mono<UserDto> activateUser(@PathVariable int id, @RequestBody User user) {
        logger.info("update api" + id);
        return userservice.activateUser(id, user);
    }
    //delete  user by firstname //
    @DeleteMapping(value = "/delete/{firstName}")
    @ResponseStatus(code = HttpStatus.OK)
    public Mono<Void> deletByName(@PathVariable String firstName) {

        return userservice.deleteByFirstName(firstName);
    }

}