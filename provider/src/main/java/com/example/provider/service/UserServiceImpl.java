package com.example.provider.service;

import com.example.nacos.service.UserService;
import com.example.provider.config.NacosConfig;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

@DubboService(version = "${dubbo.service.version}")
public class UserServiceImpl implements UserService {
    @Autowired
    private NacosConfig nacosConfig;
    @Override
    public String getUsers() {
        return "User service "+this.nacosConfig.getServerName();
    }
}
