package com.telran.jpademo.controller;

import com.telran.jpademo.entity.User;
import com.telran.jpademo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/users/save")
    public User save(@RequestBody User user) {
        //save = save and update
        System.out.println("User before save");
        System.out.println(user);
        System.out.println();

        user = userRepository.save(user);

        System.out.println("User after save");
        System.out.println(user);

        return user;

    }

    @GetMapping("/users/all")
    public List<User> getAll() {
        return userRepository.findAll();
    }
}
