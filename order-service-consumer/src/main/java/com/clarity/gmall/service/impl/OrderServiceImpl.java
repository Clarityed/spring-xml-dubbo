package com.clarity.gmall.service.impl;

import com.clarity.gmall.entity.UserAddress;
import com.clarity.gmall.service.OrderService;
import com.clarity.gmall.service.UserService;

import java.util.List;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2022年11月16日 19:08
 */
public class OrderServiceImpl implements OrderService {

    UserService userService;
    @Override
    public void initOrder(String userId) {
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        System.out.println(userAddressList);
    }

}
