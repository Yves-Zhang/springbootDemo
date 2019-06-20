package com.example.demo.service.Interfaces;

import com.example.demo.dto.baseDtoPackage.BaseDto;
import com.example.demo.entity.UserEntity;

public interface UserService {
    public BaseDto addUser(UserEntity user);
}
