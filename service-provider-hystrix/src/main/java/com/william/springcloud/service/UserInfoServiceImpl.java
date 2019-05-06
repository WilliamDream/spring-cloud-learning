package com.william.springcloud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService{

	public List<String> list() {
		List<String> list = new ArrayList<String>();
//		list.add("张晓军");
//		list.add("王老五");
//		list.add("周亮");
		return list;
	}

}
