package com.william.springcloud.service;

import com.william.springcloud.entity.Goods;
import com.william.springcloud.entity.Order;

import java.util.List;

/**
 * @Auther: williamdream
 * @Description:
 */
public class UserOrderService implements OrderService{
    @Override
    public List<Order> getOrderByOrderId(int orderId) {
        return null;
    }

    @Override
    public List<Goods> getGoodsByOrderId(int orderId) {
        return null;
    }

}
