package com.example.demo.mapper;

import com.example.demo.entity.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {

    @Insert("INSERT INTO userList(userName,password) VALUES(#{userName}, #{password})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    int insert(UserEntity user);

    @Select("SELECT * FROM userList WHERE userName = #{userName} AND password = #{password}")
    List<UserEntity> getUser(UserEntity user);

    @Select("SELECT * FROM userList")
    List<UserEntity> searchUser();
}
