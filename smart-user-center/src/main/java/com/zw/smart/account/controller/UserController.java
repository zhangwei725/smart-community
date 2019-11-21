package com.zw.smart.account.controller;

import com.zw.smart.account.domain.dto.UserDto;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @author zhangwei
 */
@RestController
@RequestMapping("/account")
public class UserController extends BaseController {
    @Resource

    /**
     * 对数据进行校验
     *
     * @param userDto
     * @return
     * @Validated 对dto进行数据校验
     */
    @PostMapping("/register")
    public String register(@Validated @RequestBody UserDto userDto) {

        return "";
    }

    @RequestMapping("/verify")
    public String isExist(String username) {
        return "";
    }
//    /api/v2/account/active?token=activekey

//    过期时间
//    key  value  过期时间 activekey
//    "activekey": id


    /**
     * uid  安全吗?
     * 激活账号
     *
     * @return
     */
    @RequestMapping("/active")
    public String activeUser(String tooken) {
//        从reids中获取tooken获取用户id
        return "";
    }

}
