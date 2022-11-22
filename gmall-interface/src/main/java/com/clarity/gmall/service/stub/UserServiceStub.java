package com.clarity.gmall.service.stub;

import com.clarity.gmall.entity.UserAddress;
import com.clarity.gmall.service.UserService;

import java.util.List;

/**
 * 用户接口本地存根
 *
 * @author: clarity
 * @date: 2022年11月22日 21:01
 */

public class UserServiceStub implements UserService {

    private final UserService userService;

    // 构造函数传入真正的远程代理对象
    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("UserServiceStub类正在执行......");
        if (userId != null) {
            return userService.getUserAddressList(userId);
        }
        return null;
    }
}
