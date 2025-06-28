package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.UserDto;
import com.example.demo.model.User;
@Service
public interface UserService {

    User createUser(UserDto user);

    List<User> getAllUsers();
    
}
