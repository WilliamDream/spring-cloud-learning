package com.william.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private DiscoveryClient client;
	
	@GetMapping("/user")
	public String getUserInfo() {
		System.out.println("获取用户信息");
		return "获取用户信息成功!";
	}
	
	@GetMapping("/user/discovery")
	public Object discovery() {
		List<String> list = client.getServices();
		System.out.println(list);
		List<ServiceInstance> servicelist = client.getInstances("UserInfo-Service");
		for (ServiceInstance serviceInstance : servicelist) {
			System.out.println(serviceInstance.getServiceId()+"\t"+
					serviceInstance.getHost()+"\t"+serviceInstance.getPort()+"\t"+
					serviceInstance.getUri());
		}
		return this.client;
	}
	
	
}
