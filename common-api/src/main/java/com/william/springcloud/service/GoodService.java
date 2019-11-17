package com.william.springcloud.service;

import com.william.springcloud.entity.Goods;
import com.william.springcloud.hystrix.GoodServiceHystrix;
import com.william.springcloud.hystrix.UserInfoServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@FeignClient(value = "Service-Provider-Hystrix",fallback = GoodServiceHystrix.class)
public interface GoodService {

    @GetMapping(value = "/goods/all")
    List<String> getGoods();


    @PostMapping(value = "/goods/add")
    void addGood();



}
