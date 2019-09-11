package com.william.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 配置中心客户端
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigCentreClientApp
{
    public static void main( String[] args ) {
        SpringApplication.run(ConfigCentreClientApp.class,args);
    }
}
