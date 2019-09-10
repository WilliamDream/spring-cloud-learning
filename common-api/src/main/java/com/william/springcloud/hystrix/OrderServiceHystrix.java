package com.william.springcloud.hystrix;

import com.william.springcloud.entity.Order;
import com.william.springcloud.service.OrderService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderServiceHystrix implements OrderService {

    @Override
    public Order getUserOrderByID(int orderId) {
        Order order = new Order();
        order.setCode(-1);
        order.setCodeMsg("服务异常");
        return order;
    }

    @Override
    public List<Order> getUserOrderByUserId(int userId) {
        List<Order> list = new ArrayList<>();
        Order order = new Order();
        order.setCode(-1);
        order.setCodeMsg("服务异常");
        list.add(order);
        return list;
    }

}
