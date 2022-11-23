package com.clarity.gmall;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

// @EnableDubbo 对于笔记第一种方式
// @ImportResource(locations = "classpath:provider.xml") 对于笔记第二种方式
// 下面是对于笔记第三种方式
// 1. @EnableDubbo(scanBasePackages = "com.clarity.gmall.service.impl")
// 2. @EnableDubbo
// 3. @DubboComponentScan(basePackages = "com.clarity.gmall.service.impl")
@EnableDubbo
@SpringBootApplication
public class SpringBootUserServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootUserServiceProviderApplication.class, args);
    }

}
