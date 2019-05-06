package com.william.springcloud.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.william.springcloud.service.UserInfoService;


@RestController
public class UserInfoController {

	private UserInfoService service;
	
	@GetMapping("/getlist")
	public List<String> getUsers() {
		List<String> list = service.list();
		return list;
	}
	
}
