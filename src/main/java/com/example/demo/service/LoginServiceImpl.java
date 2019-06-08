package com.example.demo.service;

import com.example.demo.dto.LoginDto;
import com.example.demo.dto.baseDtoPackage.BaseDto;
import com.example.demo.service.Interfaces.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    public LoginDto<Map> loginDto;

    public BaseDto SUCCESS() {
        Map<String, String> dataSource = new HashMap();
        dataSource.put("userName", "zhangsan");
        dataSource.put("passworld", "");
        loginDto.setData(dataSource);
        return loginDto;
    }

    public BaseDto FAILED() {
        return loginDto;
    }
}
