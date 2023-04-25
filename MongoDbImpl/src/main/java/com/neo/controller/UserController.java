package com.neo.controller;

import com.neo.model.User;
import com.neo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping
    public String createUser(@RequestBody User user) {

        log.info("In Post service");
        return userService.createUser(user);
    }

    @GetMapping
    public List<User> getAllUser() {
        return userService.findAll();
    }

    @GetMapping("/{name}")
    public User getUserByName(@PathVariable String name) {

        return userService.findByName(name);
    }

    @GetMapping("/{email}/{username}")
    public List<User> getUserByName(@PathVariable String email, @PathVariable String username) {

        return userService.findByEmailAndUsername(email, username);
    }

    @DeleteMapping("/delete/{name}")
    public String deleteUserByName(@PathVariable String name) {
        return userService.deleteByName(name);

    }

    @GetMapping("/age/{age}")
    public List<User>getUserByAge(@PathVariable Integer age) {

        return userService.getUserByAge(age);
    }

}
