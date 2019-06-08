package com.example.demo.service;

import com.example.demo.dto.LoginDto;
import com.example.demo.dto.baseDtoPackage.BaseDto;
import com.example.demo.service.Interfaces.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service("LoginService")
public class LoginServiceImpl implements LoginService {

    public BaseDto<Map> logindto;

    public BaseDto SUCCESS() {
        Map dataSource = new HashMap<String, String>();
        dataSource.put("userName", "zhangsan");
        dataSource.put("passworld", "");
        logindto.setData(dataSource);
        return logindto;
    }

    public BaseDto FAILED() {
        return logindto;
    }
}
