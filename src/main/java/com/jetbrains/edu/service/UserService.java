package com.jetbrains.edu.service;

import com.jetbrains.edu.entity.User;
import com.jetbrains.edu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getAllUser(){
        return userMapper.findAll();
    }

    public User getUserById(int id){
        return userMapper.findById(id);
    }

    public User addUser(User user) {
        userMapper.insert(user);
        return user;
    }

    public User updateUser(User user) {
        userMapper.update(user);
        return user;
    }

    public void deleteUser(int id) {
        userMapper.delete(id);
    }

}
