package com.william.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 配置中心客户端
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigCentreClientApp
{
    public static void main( String[] args ) {
        SpringApplication.run(ConfigCentreClientApp.class,args);
    }
}
