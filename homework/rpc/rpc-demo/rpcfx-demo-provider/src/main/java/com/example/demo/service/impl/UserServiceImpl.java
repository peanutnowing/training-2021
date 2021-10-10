package com.example.demo.service.impl;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

/**
 * @author peanutnowing
 */
public class UserServiceImpl implements UserService {

    @Override
    public User findById(Integer id) {
        return new User(id, "RPC");
    }
}
