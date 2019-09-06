package com.william.springcloud.controller;

import com.william.springcloud.entity.UserInfo;
import com.william.springcloud.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * 使用接口的方式，面向接口编程调用服务,像调用本地服务一样调用远程服务
 * 区别于使用RibbOn+RestTemplate调用服务
 */
@RestController
@RequestMapping("/feigntest")
public class UserInfoController implements UserInfoService{

	@Autowired
	private UserInfoService service;


	public Collection<UserInfo> getAll() {
		return service.getAll();
	}

	public boolean add(@RequestBody UserInfo userInfo) {
		return service.add(userInfo);
	}
}
