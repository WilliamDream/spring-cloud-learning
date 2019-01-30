package com.william.springcloud.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Value("${server.port}")
	private String serverPort;
	
	@Autowired
	private DiscoveryClient client;
	
	@GetMapping("/user")
	public String getUserInfo() {
		System.out.println("获取用户信息");
		return "获取用户信息成功!"+serverPort+"---"+new Date().getTime();
	}
	
	@GetMapping("/user/discovery")
	public Object discovery() {
		List<String> list = client.getServices();
		System.out.println(list);
		List<ServiceInstance> servicelist = client.getInstances("userinfo-service");
		for (ServiceInstance serviceInstance : servicelist) {
			System.out.println(serviceInstance.getServiceId()+"\t"+
					serviceInstance.getHost()+"\t"+serviceInstance.getPort()+"\t"+
					serviceInstance.getUri());
		}
		return this.client;
	}
	
	
}
