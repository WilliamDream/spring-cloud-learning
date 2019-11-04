package com.william.springcloud.service;

import com.william.springcloud.entity.UserInfo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService{

	@Override
	public List<String> getAll() {
		List<String> list = new ArrayList<String>();
		list.add("张晓军");
		list.add("王老五");
		list.add("周亮");
		return list;
	}

	@Override
	public boolean add(UserInfo userInfo) {
		return false;
	}
}
