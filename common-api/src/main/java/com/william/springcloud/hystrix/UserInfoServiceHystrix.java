package com.william.springcloud.hystrix;

import com.william.springcloud.entity.UserInfo;
import com.william.springcloud.service.UserInfoService;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Collections;

@Component
public class UserInfoServiceHystrix implements UserInfoService{

	public Collection<UserInfo> getAll() {
		System.out.println("发生熔断了");
		return Collections.emptyList();
	}

	public boolean add(UserInfo userInfo) {
		System.out.println("发生熔断了");
		return false;
	}
}
