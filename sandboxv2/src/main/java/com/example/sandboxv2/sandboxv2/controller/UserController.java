package com.example.sandboxv2.sandboxv2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sandboxv2.sandboxv2.entity.Users;
import com.example.sandboxv2.sandboxv2.services.UserService;

@RestController
@RequestMapping("/api/users")
@CrossOrigin("http://localhost:5173")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<Users> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{userID}")
    public Users getUsersById(@PathVariable Long userID) {
        return userService.getUsersById(userID);
    }

    @PostMapping
    public Users saveUsers(@RequestBody Users users) {
        return userService.saveUsers(users);
    }

    @DeleteMapping("/{userID}")
    public void deleteUsers(@PathVariable Long userID) {
        userService.deleteUser(userID);
    }
}
