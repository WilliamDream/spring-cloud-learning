package com.william.springcloud.controller;

import com.alibaba.fastjson.JSONArray;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.william.springcloud.service.UserInfoService;
import com.william.springcloud.service.UserInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserInfoController {

	@Autowired
	private UserInfoServiceImpl service;


	@GetMapping("/all")
	public List<String> getAll() {
//		List<String> list = service.getAll();
		List<String> list = new ArrayList<String>();
		list.add("张晓军");
		list.add("王老五");
		list.add("周亮");
		return list;
	}
	/**
	 * 一旦调用服务方法失败并抛出了错误信息后，
	 * 会自动调用@HystrixCommand标注好的fallbackMethod调用类中的指定方法
	 * 
	 */
	@GetMapping("/users")
	@HystrixCommand(fallbackMethod="getDataException")
	public String getUsers() {
		List<String> list = service.getAll();
		return JSONArray.toJSONString(list);
	}


	@GetMapping("/userinfo")
	@HystrixCommand(fallbackMethod = "getDataException",
			commandProperties = {
					@HystrixProperty(name="execution.isolation.strategy", value="SEMAPHORE")
			}
	)
	public String getUserInfo() {
		List<String> list = service.getAll();
		if(list.size()<1) {
			throw new RuntimeException("服务发生异常");
		}
		return "shuju";
	}


	public String getDataException(){
		return "没有数据";
	}
	
}
