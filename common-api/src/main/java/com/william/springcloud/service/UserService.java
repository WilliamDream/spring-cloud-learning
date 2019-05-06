package com.william.springcloud.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.william.springcloud.entity.UserInfo;

@FeignClient(value = "UserInfo-Service")
public interface UserService {

	@GetMapping(value = "/user/list")
	public List<String> list();
	
	@PostMapping(value = "/user/add")
	public boolean add(UserInfo userInfo); 
	
}
