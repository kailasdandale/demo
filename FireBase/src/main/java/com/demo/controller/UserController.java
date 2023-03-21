package com.demo.controller;

import com.demo.entity.User;
import com.demo.service.UserFirebaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserFirebaseService firebaseService;

    @PostMapping
    @ResponseStatus(code = HttpStatus.OK)
    public String createUser(@RequestBody User user) throws InterruptedException, ExecutionException {
        System.out.println("In post create endpoint !!" + user);
        return firebaseService.createUser(user);

    }

    @GetMapping("/{name}")
    public User getUser(@PathVariable String name) throws InterruptedException, ExecutionException {

        return firebaseService.findUserByName(name);
    }

    @PutMapping("/update")
    public String updateUser(@RequestBody User user) throws ExecutionException, InterruptedException {
        return firebaseService.updateUser(user);

    }

    @DeleteMapping("/{name}")
    public String deleteUser(@PathVariable String name) throws InterruptedException {

        return firebaseService.deleteUser(name);
    }

    @GetMapping
    public List<User> getUsers() throws ExecutionException, InterruptedException {
        return firebaseService.getUsers();
    }
}
