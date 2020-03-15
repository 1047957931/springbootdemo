package com.itheima.chapter02.domain;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration  //指定当前类为配置类     也可以使用@compenent注解代替
//@Component //与 @Configation 替换，不用 @EnableConfigurationProperties(MyProperties.class)
@PropertySource("classpath:test.properties")   //指定自定义配置文件的位置和名称
@EnableConfigurationProperties(MyProperties.class)  //开启配置类的属性注入功能
@ConfigurationProperties(prefix = "test")
public class MyProperties {


    private int id;
    private String name;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyProperties{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
