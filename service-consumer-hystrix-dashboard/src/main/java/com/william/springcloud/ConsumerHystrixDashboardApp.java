package com.william.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


@SpringBootApplication
@EnableHystrixDashboard
public class ConsumerHystrixDashboardApp 
{
	public static void main( String[] args ){
    	SpringApplication.run(ConsumerHystrixDashboardApp.class, args);
    }
}
