package com.william.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * zuul服务
 *
 */
@SpringBootApplication
@EnableZuulProxy
public class MyZuulApp {
    public static void main( String[] args ){
    	SpringApplication.run(MyZuulApp.class, args);
    }
}
