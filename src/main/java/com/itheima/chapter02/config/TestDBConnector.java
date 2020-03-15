package com.itheima.chapter02.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile(value = "test")
public class TestDBConnector implements DBConnector {
    @Override
    public void configure() {
        System.out.println("数据库环境配置--test");
    }
}
