package com.william.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 配置管理服务端
 *
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCentreServerApp
{
    public static void main( String[] args ){
        SpringApplication.run(ConfigCentreServerApp.class,args);
    }
}
