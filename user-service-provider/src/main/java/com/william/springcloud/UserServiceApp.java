package com.william.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient			//注册服务到Eureka
@EnableDiscoveryClient		//服务发现
public class UserServiceApp {
    public static void main( String[] args ){
    	SpringApplication.run(UserServiceApp.class, args);
    }
}
