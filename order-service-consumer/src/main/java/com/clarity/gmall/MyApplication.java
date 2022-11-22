package com.clarity.gmall;

import com.clarity.gmall.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 启动消费者服务
 *
 * @author: clarity
 * @date: 2022年11月17日 17:16
 */
public class MyApplication {

    @SuppressWarnings("resources")
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");
        OrderService orderService = applicationContext.getBean(OrderService.class);
        orderService.initOrder("1001");
        System.in.read();
    }

}