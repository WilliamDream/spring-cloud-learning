package com.william.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.william.springcloud"})
public class EurekaFeignApp 
{
	public static void main( String[] args ){
    	SpringApplication.run(EurekaFeignApp.class, args);
    }
}
