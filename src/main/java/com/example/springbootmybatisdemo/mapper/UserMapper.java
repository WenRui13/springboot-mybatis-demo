package com.example.springbootmybatisdemo.mapper;

import com.example.demo.entity.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}