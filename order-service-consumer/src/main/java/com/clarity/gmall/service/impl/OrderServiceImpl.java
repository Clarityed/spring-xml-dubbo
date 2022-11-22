package com.clarity.gmall.service.impl;

import com.clarity.gmall.entity.UserAddress;
import com.clarity.gmall.service.OrderService;
import com.clarity.gmall.service.UserService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 用户接口服务实现
 *
 * @author: clarity
 * @date: 2022年11月16日 19:08
 */

// @Service// 该注解是 Dubbo 的
@Service // 该注释注解是 Spring 的
public class OrderServiceImpl implements OrderService {

    @Autowired
    private UserService userService;

    @Override
    public void initOrder(String userId) {
        System.out.println("用户id：" + userId);
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        List<String> addressList = userAddressList.stream().map(UserAddress::getUserAddress).collect(Collectors.toList());
        addressList.forEach(System.out::println);
    }

}
