package com.clarity.gmall;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class SpringBootOrderServiceConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootOrderServiceConsumerApplication.class, args);
    }

}
