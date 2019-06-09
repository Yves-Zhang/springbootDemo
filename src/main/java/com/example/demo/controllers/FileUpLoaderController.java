package com.example.demo.controllers;

import com.example.demo.dto.LoginDto;
import com.example.demo.dto.baseDtoPackage.BaseDto;
import com.example.demo.service.Interfaces.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/fileUpLoader_api")
public class FileUpLoaderController {

    @Autowired
    private FileUploadService fileUploadService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public BaseDto upLoad(@RequestParam("fileUpLoad") MultipartFile file, HttpServletRequest request) {
        BaseDto result = fileUploadService.SUCCESS(file);
        return result;
    }
}