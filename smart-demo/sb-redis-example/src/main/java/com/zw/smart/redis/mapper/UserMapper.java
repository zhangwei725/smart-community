package com.zw.smart.redis.mapper;

import com.zw.smart.redis.entity.User;

import java.util.List;

public interface UserMapper {
    List<User> selectAll();
}
