package com.william.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/userinfo")
public class UserInfoController {

	private static String USERSERVICE_PREFIX_URL = "http://UserInfo-Service";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/getuser")
	public ResponseEntity getUserinfo() {
		ResponseEntity<String> res = restTemplate.getForEntity(USERSERVICE_PREFIX_URL+"/user", String.class);
		return res;
	}
	
}
