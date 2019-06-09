package com.example.demo.controllers;

import com.example.demo.dto.LoginDto;
import com.example.demo.dto.baseDtoPackage.BaseDto;
import com.example.demo.service.Interfaces.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fileUpLoader_api")
public class FileUpLoaderController {

    @Autowired
    private FileUploadService fileUploadService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public BaseDto upLoad() {
        BaseDto result = fileUploadService.SUCCESS();
        return result;
    }
}