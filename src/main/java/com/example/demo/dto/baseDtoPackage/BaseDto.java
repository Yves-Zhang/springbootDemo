package com.example.demo.dto.baseDtoPackage;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
public class BaseDto<T> {
    public String resultCode = "0000";
    public String resultMessage = "请求成功！";
    public T data;
}