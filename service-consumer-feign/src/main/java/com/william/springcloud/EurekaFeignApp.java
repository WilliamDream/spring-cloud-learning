package com.william.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * fegin是面向接口编程
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.william.springcloud"})
@ComponentScan(basePackages= {"com.william.springcloud"})
public class EurekaFeignApp 
{
	public static void main( String[] args ){
    	SpringApplication.run(EurekaFeignApp.class, args);
    }
}
