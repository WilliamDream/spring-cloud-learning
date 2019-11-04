package com.william.springcloud.hystrix;

import com.william.springcloud.entity.UserInfo;
import com.william.springcloud.service.UserInfoService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Component		//不要忘记该注解，否则找不到
public class UserInfoServiceHystrix implements UserInfoService{

	public List<String> getAll() {
		System.out.println("发生熔断了");
		return new ArrayList<>();
	}

	public boolean add(UserInfo userInfo) {
		System.out.println("发生熔断了");
		return false;
	}
}
