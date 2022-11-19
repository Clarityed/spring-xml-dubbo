package com.clarity.gmall.controller;

import com.clarity.gmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 远程调用测试接口
 *
 * @author: clarity
 * @date: 2022年11月19日 13:19
 */
@RestController
@RequestMapping("/dubbo")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/init_order")
    public String initOrder(@RequestParam("uid") String userId) {
        orderService.initOrder(userId);
        return "调用成功！！！！";
    }
}
