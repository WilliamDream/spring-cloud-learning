package com.william.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 用户订单服务
 *
 */


@SpringBootApplication
@EnableEurekaClient
public class OrderServiceProviderApp
{
    public static void main( String[] args ) {
        SpringApplication.run(OrderServiceProviderApp.class,args);
    }
}
