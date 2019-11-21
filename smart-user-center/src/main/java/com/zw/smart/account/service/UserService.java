package com.zw.smart.account.service;

import com.zw.smart.account.domain.dto.UserDto;
import com.zw.smart.account.domain.entity.User;

public interface UserService {


    User findUserByName(String username);

    /**
     * 注册
     *
     * @param userDto
     * @return
     */
    UserDto register(UserDto userDto);
}
