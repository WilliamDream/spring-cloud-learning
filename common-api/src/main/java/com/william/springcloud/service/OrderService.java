package com.william.springcloud.service;


import com.william.springcloud.entity.Goods;
import com.william.springcloud.entity.Order;
import com.william.springcloud.hystrix.OrderServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "UserOrder-Service",fallback = OrderServiceHystrix.class)
public interface OrderService {

    @GetMapping("order/getOrderByOrderId/{orderId}")
    List<Order> getOrderByOrderId(@PathVariable("orderId") int orderId);

    @GetMapping("order/getGoodsByOrderId{orderId}")
    List<Goods> getGoodsByOrderId(@PathVariable("orderId") int orderId);


}
