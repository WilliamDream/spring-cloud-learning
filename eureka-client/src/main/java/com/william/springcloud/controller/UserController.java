package com.william.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/user")
	public String getUserInfo() {
		System.out.println("获取用户信息");
		return "获取用户信息成功!";
	}
}
