package com.example.demo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserDto;
import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;
import com.example.demo.service.UserService;
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepo userRepository;
    @Override
    public User createUser(UserDto user) {
        User newUser = new User();
        newUser.setName(user.getName());
        newUser.setEmail(user.getEmail());
        newUser.setPassword(user.getPassword());
        userRepository.save(newUser);
        return newUser;
    }
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    

}
