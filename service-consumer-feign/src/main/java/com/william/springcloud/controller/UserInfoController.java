package com.william.springcloud.controller;

import com.william.springcloud.service.UserInfoServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/feign")
public class UserInfoController {

	/**
	 * 使用接口的方式，面向接口编程调用服务
	 * 区别于使用RibbOn+RestTemplate调用服务
	 */
	@Autowired
	private UserInfoServiceFeign service;
	
	@GetMapping("/getUserInfo")
	public String getUserInfo() {
		return service.getUserInfo();
	}
	
}
