package com.clarity.gmall.service;


import com.clarity.gmall.entity.UserAddress;

import java.util.List;

/**
 * 用户服务层接口
 *
 * @author: clarity
 * @date: 2022年11月16日 18:50
 */
public interface UserService {

    /**
     * 按照用户 id 返回所有的收货地址
     * @param userId
     * @return
     */
    List<UserAddress> getUserAddressList(String userId);

}
