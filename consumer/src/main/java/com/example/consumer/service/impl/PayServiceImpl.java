package com.example.consumer.service.impl;

import com.example.consumer.service.PayService;
import com.example.nacos.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

@Service
public class PayServiceImpl implements PayService {
    @DubboReference(version = "${dubbo.service.version}",check = false)
    private UserService userService;
    @Override
    public String test() {
        String pay="Pay Service ";
        return pay+this.userService.getUsers();
    }
}
