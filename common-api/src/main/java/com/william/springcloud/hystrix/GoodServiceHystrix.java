package com.william.springcloud.hystrix;

import com.william.springcloud.service.GoodService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2019/11/2 22:18
 */
@Component
public class GoodServiceHystrix implements GoodService{

    @Override
    public List<String> getGoods() {
        System.out.println("发生熔断了");
        return new ArrayList<>();
    }

    @Override
    public void addGood() {
        System.out.println("发生熔断了");
    }
}
