package com.william.springcloud.controller;

import com.william.springcloud.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@RestController
@RequestMapping("/user")
public class UserController {

	private final Map<Integer, UserInfo> userMap = new ConcurrentHashMap<Integer,UserInfo>();

	@Value("${server.port}")
	private String serverPort;
	
	@Autowired
	private DiscoveryClient client;

	@GetMapping("/all")
	public List<String> getAllUser() {
//		List<String> list = service.getAll();
		List<String> list = new ArrayList<String>();
		list.add("张晓军");
		list.add("王老五");
		list.add("周亮");
		return list;
	}

	@GetMapping("/user")
	public String getUserInfo() {
		System.out.println("获取用户信息");
		return "获取用户信息成功!"+serverPort+"---"+new Date().getTime();
	}

	@PostMapping("/user/add")
	public boolean addUser(@RequestBody UserInfo userInfo){
		return userMap.put(userInfo.getId(),userInfo)==null;
	}

	@GetMapping(value = "/user/getall")
	public Collection<UserInfo> getAll(){
//		throw new RuntimeException("发生异常");
		return userMap.values();
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
