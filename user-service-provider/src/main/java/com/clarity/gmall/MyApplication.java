package com.clarity.gmall;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 启动提供者服务
 *
 * @author: clarity
 * @date: 2022年11月17日 8:16
 */
public class MyApplication {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("provider.xml");
        ioc.start();
        System.in.read();
    }

}
