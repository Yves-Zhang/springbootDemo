package com.example.demo.service;

import com.example.demo.dto.FileUpLoadDto;
import com.example.demo.dto.baseDtoPackage.BaseDto;
import com.example.demo.service.Interfaces.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileUploadServiceImp implements FileUploadService {

    @Autowired
    private FileUpLoadDto fileUpLoadDto;

    public BaseDto SUCCESS() {
        return fileUpLoadDto;
    }

    public BaseDto FAILED() {
        return fileUpLoadDto;
    }
}