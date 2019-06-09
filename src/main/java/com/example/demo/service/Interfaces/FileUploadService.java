package com.example.demo.service.Interfaces;

import com.example.demo.dto.baseDtoPackage.BaseDto;

public interface FileUploadService<T> extends BaseService {
    public BaseDto SUCCESS(T t);
}
