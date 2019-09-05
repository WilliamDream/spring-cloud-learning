package com.william.springcloud.hystrix;

import com.william.springcloud.service.UserInfoServiceFeign;
import org.springframework.stereotype.Component;


@Component
public class UserInfoHystrix implements UserInfoServiceFeign{

    public String getUserInfo() {
        return "熔断器：发生异常";
    }
}
