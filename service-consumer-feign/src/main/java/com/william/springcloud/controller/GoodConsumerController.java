package com.william.springcloud.controller;

import com.william.springcloud.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/goods")
public class GoodConsumerController {

    @Autowired
    private GoodService service;

    @GetMapping("/all")
    public List<String> getGoods(){
        return service.getGoods();
    }
}
