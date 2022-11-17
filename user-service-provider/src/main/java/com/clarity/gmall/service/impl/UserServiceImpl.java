package com.clarity.gmall.service.impl;

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
public class UserServiceImpl implements UserService {

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress userAddress1 = new UserAddress(1, "1", "1", "1", "1", "1");
        UserAddress userAddress2 = new UserAddress(2, "2", "2", "2", "2", "2");
        return Arrays.asList(userAddress1, userAddress2);
    }

}
