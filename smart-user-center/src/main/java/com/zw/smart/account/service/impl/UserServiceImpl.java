package com.zw.smart.account.service.impl;

import com.zw.smart.account.domain.dto.UserDto;
import com.zw.smart.account.domain.entity.User;
import com.zw.smart.account.mapper.UserMapper;
import com.zw.smart.account.message.MqMailSender;
import com.zw.smart.account.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 判断账号是否存在
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Resource
    MqMailSender mailSender;
    @Resource
    private UserMapper userMapper;

    /**
     * @param username
     * @return
     */
    @Override
    public User findUserByName(String username) {
        return userMapper.selectByName(username);
    }

    /**
     * 判断用户是否存在
     *
     * @param userDto
     * @return 邮箱验证
     */
    @Override
    public UserDto register(UserDto userDto) {
        User user = findUserByName(userDto.getUsername());
        if (user == null) {
            user = new User();
            BeanUtils.copyProperties(userDto, user);
            int count = userMapper.insert(user);
            if (count == 1) {
                mailSender.sendRegisterMsg(user.getUid());
            }
        } else {
            log.info("账号已被注册!!!");
        }
        return null;
    }


}
