package com.william.springcloud.hystrix;

import com.william.springcloud.entity.Goods;
import com.william.springcloud.service.GoodsServiceFeign;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2019/11/17 12:28
 */
public class GoodsServiceFeignHystrix implements GoodsServiceFeign{
    @Override
    public Goods getGoodsById(int goodsId) {
        return null;
    }

    @Override
    public void addGoods(Goods goods) {

    }
}
