package com.william.springcloud.controller;


import com.william.springcloud.entity.Goods;
import com.william.springcloud.entity.Order;
import com.william.springcloud.service.GoodsServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2019/11/12 22:33
 */

@RestController
@RequestMapping("/order")
public class OrderController {

    private static List<Order> ordersList = new ArrayList<>();

    static {
        Order order = new Order();
        order.setId(10000);
        order.setTitle("订单1");
        order.setUserId(1001);
        order.setOrderId(111110001);
        order.setGoodsId(201);
        ordersList.add(order);

        order = new Order();
        order.setId(10001);
        order.setTitle("订单2");
        order.setUserId(1002);
        order.setOrderId(111110035);
        order.setGoodsId(162);
        ordersList.add(order);

        order = new Order();
        order.setId(10002);
        order.setTitle("订单1");
        order.setUserId(1001);
        order.setOrderId(111110001);
        order.setGoodsId(580);
        ordersList.add(order);
    }

    @Autowired
    private GoodsServiceFeign goodsServiceFeign;

    @RequestMapping("/getOrderByOrderId/{orderId}")
    public List<Order> getOrderByID(@PathVariable("orderId") int orderId){
        List<Order> orders = new ArrayList<>();
        for(int i=0;i<ordersList.size();i++){
            if(ordersList.get(i).getOrderId()==orderId){
                orders.add(ordersList.get(i));
            }
        }
        return orders;
    }


    @GetMapping("/getGoodsByOrderId/{orderId}")
    public List<Goods> getGoodsByOrderId(@PathVariable("orderId") int orderId){
        List<Goods> orderGoodsList = new ArrayList<>();
        for(int i=0;i<ordersList.size();i++){
            if(ordersList.get(i).getOrderId()==orderId){
                int goodsId = ordersList.get(i).getGoodsId();
                Goods goods = goodsServiceFeign.getGoodsById(goodsId);
                orderGoodsList.add(goods);
            }else {
                continue;
            }
        }
        return orderGoodsList;
    }


}
