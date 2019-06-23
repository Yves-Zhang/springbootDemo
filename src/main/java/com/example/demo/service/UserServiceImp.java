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
import java.util.List;
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

    public BaseDto checkoutUser(UserEntity user) {
        List result = userMapper.getUser(user);

        if(result.size() > 0) {
            Map<String, List> data = new HashMap();
            data.put("data", result);
            userDto.setData(data);
            userDto.setResultCode("0000");
            userDto.setResultMessage("请求成功！");
        }else {
            userDto.setResultCode("9999");
            userDto.setResultMessage("当前用户或密码错误！");
            userDto.setData(null);
        }

        return userDto;
    }

    public BaseDto searchUser() {
        List result = userMapper.searchUser();
//        String params = JSON.toJSONString(result);
        Map<String, List> data = new HashMap();
        data.put("data", result);
        userDto.setData(data);
        return userDto;
    }
}
