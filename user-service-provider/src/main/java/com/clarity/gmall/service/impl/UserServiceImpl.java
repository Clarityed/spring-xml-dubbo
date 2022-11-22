package com.clarity.gmall.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.clarity.gmall.entity.UserAddress;
import com.clarity.gmall.service.UserService;

import java.util.Arrays;
import java.util.List;

/**
 * 用户接口实现层
 *
 * @author: clarity
 * @date: 2022年11月16日 18:54
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("UserServiceImpl:20890");
//        System.out.println("UserServiceImpl:20891");
        UserAddress userAddress1 = new UserAddress(1, "1", "1", "1", "1", "1");
        UserAddress userAddress2 = new UserAddress(2, "2", "2", "2", "2", "2");
        try {
            // 让线程睡上 5 ms ，测试堵塞超时
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Arrays.asList(userAddress1, userAddress2);
    }

}
