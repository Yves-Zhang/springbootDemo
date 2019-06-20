package com.example.demo.controllers;

import com.example.demo.dto.UserDto;
import com.example.demo.dto.baseDtoPackage.BaseDto;
import com.example.demo.entity.UserEntity;
import com.example.demo.service.Interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserEntity userEntity;

    @Autowired
    private UserDto userDto;

    @RequestMapping("/test")
    public BaseDto addUser() {
        userEntity.setUserName("zhangsan");
        userEntity.setPassword("123");
        userService.addUser(userEntity);
        return userDto;
    }
}
