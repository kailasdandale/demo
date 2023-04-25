package com.neo.service;

import com.neo.model.User;
import com.neo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String createUser(User user) {

        userRepository.save(user);
        return "User saved successfully 😍😍";
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findByName(String name) {
        return userRepository.findByUsername(name);
    }

    public String deleteByName(String name) {
        userRepository.deleteByUsername(name);
        return name + " deleted successfully 🤓";
    }

    public List<User> findByEmailAndUsername(String email, String username) {
        return userRepository.findByEmailAndUsername(email, username);
    }

    public List<User> getUserByAge(Integer age) {

        return userRepository.findByAgeGraterThanEqual(age);
    }
}
