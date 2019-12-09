package com.skunk.springboot.service.Impl;

import com.skunk.springboot.mapper.UserMapper;
import com.skunk.springboot.model.User;
import com.skunk.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        return userMapper.selectAllUser();
    }
}
