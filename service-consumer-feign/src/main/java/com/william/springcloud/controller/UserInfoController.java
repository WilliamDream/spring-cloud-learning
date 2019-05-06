package com.william.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.william.springcloud.service.UserService;


@RestController
public class UserInfoController {

	/**
	 * 使用接口的方式，面向接口编程调用服务
	 * 区别于使用RibbOn+RestTemplate调用服务
	 */
	@Autowired
	private UserService service;
	
	@GetMapping("/getlist")
	public List<String> getUsers() {
		List<String> list = service.list();
		return list;
	}
	
}
