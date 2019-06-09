package com.example.demo.service;

import com.example.demo.dto.FileUpLoadDto;
import com.example.demo.dto.baseDtoPackage.BaseDto;
import com.example.demo.service.Interfaces.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Service
public class FileUploadServiceImp implements FileUploadService<MultipartFile> {

    @Autowired
    private FileUpLoadDto<String> fileUpLoadDto;

    private static String filePath = "/Users/gabriel/Desktop/workspace/javalearn/springBootDemo/src/main/resources/fileResources/";

    public BaseDto SUCCESS() {
        return fileUpLoadDto;
    }

    public BaseDto SUCCESS(MultipartFile file) {
        // 获取文件名称
        String fileName = file.getOriginalFilename();

        // 获取后缀名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));

        // 生成新的文件名
        fileName = UUID.randomUUID() + suffixName;

        // new 一个新文件在指定目录
        File dest = new File(filePath + fileName);

        // 将上传的文件转为新生成的文件
        try {
            file.transferTo(dest);
            fileUpLoadDto.setData(filePath + fileName);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return fileUpLoadDto;
    }

    public BaseDto FAILED() {
        return fileUpLoadDto;
    }
}