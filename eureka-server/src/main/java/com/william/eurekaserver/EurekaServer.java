package com.william.eurekaserver;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka 服务端
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer 
{
    public static void main( String[] args )
    {
        System.out.println( "Eureka 服务端启动成功!" );
    }
}
