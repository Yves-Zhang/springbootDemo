package com.example.demo.dto;

import com.example.demo.dto.baseDtoPackage.UserBaseDto;
import org.springframework.stereotype.Component;

@Component
public class UserDto<T> extends UserBaseDto<T> {
}
