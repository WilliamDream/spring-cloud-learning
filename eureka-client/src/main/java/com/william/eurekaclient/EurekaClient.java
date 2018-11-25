package com.william.eurekaclient;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaClient 
{
    public static void main( String[] args )
    {
        System.out.println( "Eureka 客户端启动成功!" );
    }
}
