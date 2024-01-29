package com.example.sandboxv2.sandboxv2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sandboxv2.sandboxv2.entity.Users;
import com.example.sandboxv2.sandboxv2.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }

    public Users getUsersById(Long userID) {
        return userRepository.findById(userID).orElse(null);
    }

    public Users saveUsers(Users users) {
        return userRepository.save(users);
    }

    public void deleteUser(Long userID) {
        userRepository.deleteById(userID);
    }
}
