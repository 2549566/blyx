package com.blyx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.blyx.infrastructure.mapper")
public class BlyxWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlyxWebApplication.class, args);
    }

}
