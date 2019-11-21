package com.zw.smart.maill.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import javax.mail.MessagingException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @program: parent
 * @author：zhangwei
 * @create：2019-11-21 23:40
 * @version: 1.0
 */
@SpringBootTest
class IMailServiceTest {
    @Resource
    IMailService iMailService;

    @Test
    void sendHtmlMail() throws MessagingException {
        String content = "<h1>注册邮箱</h1>";
        iMailService.sendHtmlMail("269066883@qq.com", "注册邮箱", content);
    }
}