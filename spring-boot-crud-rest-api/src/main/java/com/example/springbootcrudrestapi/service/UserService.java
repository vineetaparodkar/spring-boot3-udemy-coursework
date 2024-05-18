package com.example.springbootcrudrestapi.service;

import com.example.springbootcrudrestapi.entity.User;

import java.util.List;

public interface UserService {
     User createUser(User user);

     User getUserById(Long id);

     List<User> getAllUsers();

     User updateUser(Long id, User user);

     void deleteUser(Long id);
}
