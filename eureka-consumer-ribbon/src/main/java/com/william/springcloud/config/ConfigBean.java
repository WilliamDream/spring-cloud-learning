package com.william.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.RandomRule;

@Configuration
public class ConfigBean {

	@Bean
	@LoadBalanced    // Ribbon是客户端负载均衡，默认轮询算法
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public RandomRule randomRule() {
		return new RandomRule();
	}
	
}
