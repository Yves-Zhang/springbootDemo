package com.example.demo.service;

import com.alibaba.fastjson.JSON;
import com.example.demo.dto.UserDto;
import com.example.demo.dto.baseDtoPackage.BaseDto;
import com.example.demo.entity.UserEntity;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.Interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserDto<Map> userDto;

    @Autowired(required = false)
    private UserMapper userMapper;

    public BaseDto addUser(UserEntity user) {
        userMapper.insert(user);
        Map data = new HashMap();
        data.put("id", user.getId());
//        String param= JSON.toJSONString(data);
//        System.out.println(param);
        userDto.setData(data);
        return userDto;
    }
}
