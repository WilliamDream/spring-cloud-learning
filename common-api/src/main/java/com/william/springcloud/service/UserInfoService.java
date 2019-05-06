package com.william.springcloud.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.william.springcloud.entity.UserInfo;


/**
 * 
 * 一个实现FallbackFactory接口的类
 *
 */
@FeignClient(value = "UserInfo-Service",fallbackFactory=UserInfoServiceFallbackFactory.class)
public interface UserInfoService {

	@GetMapping(value = "/user/list")
	public List<String> list();
	
	@PostMapping(value = "/user/add")
	public boolean add(UserInfo userInfo);
}
