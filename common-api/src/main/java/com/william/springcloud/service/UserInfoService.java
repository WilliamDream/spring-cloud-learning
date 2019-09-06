package com.william.springcloud.service;

import com.william.springcloud.entity.UserInfo;
import com.william.springcloud.hystrix.UserInfoServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;


/**
 * @FeignClient注解
 * value = 服务提供方名
 * fallbackFactory = 一个熔断类
 *
 */
@FeignClient(value = "UserInfo-Service",fallback = UserInfoServiceHystrix.class)
public interface UserInfoService {

	@GetMapping(value = "/user/getall")
	Collection<UserInfo> getAll();
	
	@PostMapping(value = "/user/add")
	boolean add(@RequestBody UserInfo userInfo);
}
