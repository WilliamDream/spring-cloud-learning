package com.william.springcloud.service;


import com.william.springcloud.entity.Order;
import com.william.springcloud.hystrix.OrderServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;

@FeignClient(value = "UserOrder-Service",fallback = OrderServiceHystrix.class)
public interface OrderService {

    Order getUserOrderByID(int orderId);

    List<Order> getUserOrderByUserId(int userId);


}
