package com.example.demo.service;

import com.example.demo.dto.UserDto;
import com.example.demo.dto.baseDtoPackage.BaseDto;
import com.example.demo.entity.UserEntity;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.Interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserDto<Map> userDto;

    @Autowired
    private UserMapper userMapper;

    public BaseDto addUser(UserEntity user) {
        userMapper.insert(user);

        return userDto;
    }
}
