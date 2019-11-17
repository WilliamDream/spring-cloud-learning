package com.william.springcloud.service;

import com.william.springcloud.entity.Goods;
import com.william.springcloud.hystrix.GoodsServiceFeignHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2019/11/17 12:26
 */

@FeignClient(value = "Goods-Service-Provider" ,fallback = GoodsServiceFeignHystrix.class)
public interface GoodsServiceFeign {

    @GetMapping("/goods/{goodsId}")
    Goods getGoodsById(@PathVariable("goodsId") int goodsId);

    @GetMapping("/goods/add")
    void addGoods(@RequestBody Goods goods);

}
