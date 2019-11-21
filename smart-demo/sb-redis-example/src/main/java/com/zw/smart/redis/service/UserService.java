package com.zw.smart.redis.service;

import org.apache.catalina.User;
import org.springframework.cache.annotation.CacheEvict;

import java.util.List;

public interface UserService {

    public List<User> getUsers();
}
