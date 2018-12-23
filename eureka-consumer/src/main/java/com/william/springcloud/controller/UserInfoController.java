package com.william.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.william.springcloud.entity.UserInfo;

@RestController
@RequestMapping("/userinfo")
public class UserInfoController {

	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/getuser")
	public ResponseEntity getUserinfo() {
		ResponseEntity<String> res = restTemplate.getForEntity("http://localhost:8080/user", String.class);
		return res;
	}
	
}
