package com.zw.smart.maill.listener;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.core.RocketMQListener;

/**
 * 缺少邮箱地址
 * 邮件  第三方的邮件服务 (Spring boot 自带邮件组件)
 * redis
 * 发送的内容
 * 链接[点击激活]
 * 如果点击失效复制爱url地址到浏览器激活
 * @author zhangwei
 */
@Slf4j
public class MailListener implements RocketMQListener<Integer> {
    @Override
    public void onMessage(Integer message) {
        log.debug(message + "");
    }
}
