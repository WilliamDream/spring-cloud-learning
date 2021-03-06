package com.william.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserServiceConsumerApp 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(UserServiceConsumerApp.class, args);
    }
}
