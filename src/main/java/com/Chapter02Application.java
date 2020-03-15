package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class Chapter02Application {

    public static void main(String[] args) {

        SpringApplication.run(Chapter02Application.class, args);
    }

}
