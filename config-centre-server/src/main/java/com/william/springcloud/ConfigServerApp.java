package com.william.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 配置中心服务端
 *
 */


@SpringBootApplication
@EnableConfigServer
public class ConfigServerApp
{
    public static void main( String[] args ) {
        SpringApplication.run(ConfigServerApp.class,args);
    }
}
