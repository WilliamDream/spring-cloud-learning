package com.william.springcloud.controller;

import com.william.springcloud.entity.Order;
import com.william.springcloud.service.OrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: williamdream
 * @Description: 用户订单
 */

@RestController
@RequestMapping("/userorder")
public class UserOrderController implements OrderService{

    @Override
    public Order getUserOrderByID(int orderId) {
        return null;
    }

    @Override
    public List<Order> getUserOrderByUserId(int userId) {
        return null;
    }
}
