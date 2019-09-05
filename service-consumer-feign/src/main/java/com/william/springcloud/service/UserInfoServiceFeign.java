package com.william.springcloud.service;


import com.william.springcloud.hystrix.UserInfoHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//调用UserInfo-Service服务
@FeignClient(value = "UserInfo-Service",fallbackFactory = UserInfoHystrix.class)
public interface UserInfoServiceFeign {

    @GetMapping("/user")
    String getUserInfo();

}
