package com.william.springcloud.controller;

import com.william.springcloud.service.GoodService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2019/11/2 22:46
 */
@RestController
public class GoodController implements GoodService {

    @Override
    @GetMapping("/goods")
    public List<String> getGoods() {
        List<String> list = new ArrayList<String>();
        list.add("张晓军");
        list.add("王老五");
        list.add("周亮");
        return list;
    }

    @Override
    @PostMapping("/goods/add")
    public void addGood() {

    }
}
