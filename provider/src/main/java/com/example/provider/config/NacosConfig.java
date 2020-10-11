package com.example.provider.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Configuration
@RefreshScope
public class NacosConfig {
    @Value("${school.location}")
    private String serverName;

    public String getServerName() {
        return serverName;
    }
}
