package com.william.springcloud.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(value = "UserInfo-Service")
public interface UserInfoService {

	@GetMapping(value = "/dept/list")
	public List<Object> list();
	
}
