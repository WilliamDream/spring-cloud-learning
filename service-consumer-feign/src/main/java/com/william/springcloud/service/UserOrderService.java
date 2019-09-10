package com.william.springcloud.service;

import com.william.springcloud.entity.Order;

import java.util.List;

/**
 * @Auther: williamdream
 * @Description:
 */
public class UserOrderService implements OrderService{


    @Override
    public Order getUserOrderByID(int orderId) {
        return null;
    }

    @Override
    public List<Order> getUserOrderByUserId(int userId) {
        return null;
    }
}
