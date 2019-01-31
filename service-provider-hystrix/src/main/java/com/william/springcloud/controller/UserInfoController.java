package com.william.springcloud.controller;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.william.springcloud.service.UserInfoService;

@RestController
public class UserInfoController {

	@Autowired
	private UserInfoService service;
	
	/**
	 * 一旦调用服务方法失败并抛出了错误信息后，
	 * 会自动调用@HystrixCommand标注好的fallbackMethod调用类中的指定方法
	 * 
	 */
	@GetMapping("/getusers")
	@HystrixCommand(fallbackMethod="getDataException")
	public List<Object> getUsers() {
		List<Object> list = service.list();
		if(list==null) {
			throw new RuntimeException("没有获取到数据");
		}
		return list;
	}
	
	@SuppressWarnings("unused")
	private List<Object> getDataException(){
		List<Object> list = new ArrayList<Object>();
		JSONObject json = new JSONObject();
		try {
			json.put("code", "999");
			json.put("msg", "没有数据");
		} catch (JSONException e) {
			e.printStackTrace();
		}
		list.add(json);
		return list;
	}
	
}
