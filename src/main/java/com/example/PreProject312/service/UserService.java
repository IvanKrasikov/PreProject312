package com.example.PreProject312.service;

import com.example.PreProject312.model.User;
import java.util.List;

public interface UserService {
    User findById(Long id);
    List<User> findAll();
    User saveUser(User user);
    void deleteById(Long id);
}
