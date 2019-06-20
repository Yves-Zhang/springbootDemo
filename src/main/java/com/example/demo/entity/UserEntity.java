package com.example.demo.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class UserEntity {
    String userName;
    String password;
    int id;
}
