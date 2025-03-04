package com.example.healthcareapp.controller;

import com.example.healthcareapp.model.User;
import com.example.healthcareapp.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserAPIController {

    private final UserService userService;

    public UserAPIController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("{userId}")
    public User getUserById(@PathVariable("userId") Long userId) {
        return userService.getById(userId);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAll();
    }

    @PostMapping
    public String createUser(@RequestBody User user) {
        userService.save(user);
        return "User Created Successfully";
    }

    @PutMapping
    public String updateUser(@RequestBody User user) {
        userService.save(user);
        return "User Updated Successfully";
    }

    @DeleteMapping("{userId}")
    public String deleteUser(@PathVariable("userId") Long userId) {
        userService.delete(userId);
        return "User Deleted Successfully";
    }
}