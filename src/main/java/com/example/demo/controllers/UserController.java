package com.example.demo.controllers;

import com.alibaba.fastjson.JSON;
import com.example.demo.dto.UserDto;
import com.example.demo.dto.baseDtoPackage.BaseDto;
import com.example.demo.entity.UserEntity;
import com.example.demo.service.Interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
//
    @Autowired
    private UserEntity userEntity;

    @Autowired
    private UserDto userDto;

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public BaseDto addUser(@RequestBody UserEntity userEntity) {
//        String params = JSON.toJSONString(userEntity);
//        System.out.println(params + "__________");
        BaseDto result = userService.addUser(userEntity);
        return result;
    }
}
