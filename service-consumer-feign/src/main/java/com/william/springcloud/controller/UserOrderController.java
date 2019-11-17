package com.william.springcloud.controller;

import com.william.springcloud.entity.Goods;
import com.william.springcloud.entity.Order;
import com.william.springcloud.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: williamdream
 * @Description: 用户订单
 */

@RestController
@RequestMapping("/order")
public class UserOrderController implements OrderService{


    @Override
    @GetMapping("/getOrder/{orderId}")
    public Order getOrderByOrderId(int orderId) {
        return null;
    }

    @Override
    @GetMapping("/getGoods/{orderId}")
    public Goods getGoodsByOrderId(int orderId) {
        return null;
    }
}
