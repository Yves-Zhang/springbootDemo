package com.example.demo.dto.baseDtoPackage;

import org.springframework.stereotype.Component;

public class BaseDto<T> {
    public String resultCode = "0000";
    public String resultMessage = "请求成功！";
    public T data;

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public T getData() {
        return data;
    }

    public String getResultCode() {
        return resultCode;
    }

    public String getResultMessage() {
        return resultMessage;
    }

}
