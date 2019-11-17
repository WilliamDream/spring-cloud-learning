package com.william.springcloud.controller;

import com.william.springcloud.entity.Goods;
import com.william.springcloud.service.GoodsServiceFeign;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2019/11/17 12:40
 */

@RestController
@RequestMapping("/goods")
public class GoodsController implements GoodsServiceFeign{

    private static List<Goods> goodsList = new ArrayList<>();

    @Override
    @GetMapping("/{goodsId}")
    public Goods getGoodsById(@PathVariable("goodsId") int goodsId) {
        for (int i=0;i<goodsList.size();i++){
            if(goodsList.get(i).getGoodsId()==goodsId)
                return goodsList.get(i);
            else
                continue;
        }
        return null;
    }

    @Override
    @PostMapping("/add")
    public void addGoods(@RequestBody Goods goods) {
        goodsList.add(goods);
    }
}
