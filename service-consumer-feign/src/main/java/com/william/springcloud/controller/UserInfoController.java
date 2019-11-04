package com.william.springcloud.controller;

import com.william.springcloud.entity.UserInfo;
import com.william.springcloud.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

/**
 * 使用接口的方式，面向接口编程调用服务,像调用本地服务一样调用远程服务
 * 区别于使用RibbOn+RestTemplate调用服务
 */
@RestController
@RequestMapping("/user")
public class UserInfoController {

	@Autowired
	private UserInfoService service;


	@GetMapping("/all")
	public List<String> getAll() {
		return service.getAll();
	}

	@PostMapping("/add")
	public boolean add(@RequestBody UserInfo userInfo) {
		return service.add(userInfo);
	}
}
