package com.william.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZipkinServerApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(ZipkinServerApp.class,args);
    }
}
