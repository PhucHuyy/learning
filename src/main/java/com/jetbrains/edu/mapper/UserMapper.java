package com.jetbrains.edu.mapper;

import com.jetbrains.edu.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> findAll();
    User findById(int id);
    void insert(User user);
    void update(User user);
    void delete(int id);

}
