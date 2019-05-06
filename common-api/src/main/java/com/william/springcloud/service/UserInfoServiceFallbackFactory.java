package com.william.springcloud.service;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPObject;
import com.william.springcloud.entity.UserInfo;

import feign.hystrix.FallbackFactory;

/**
 * 在这个类中
 * 
 *
 */
public class UserInfoServiceFallbackFactory implements FallbackFactory<UserInfoService>{

	public UserInfoService create(Throwable arg0) {
		
		return new UserInfoService() {
			
			public List<String> list() {
				List<String> list = new ArrayList<String>();
				list.add("没有数据");
				return list;
			}
			
			public boolean add(UserInfo userInfo) {
				
				return false;
			}
		};
	}

	

}
