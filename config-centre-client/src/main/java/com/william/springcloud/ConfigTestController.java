package com.william.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: williamdream
 * @Description:
 */
@RefreshScope       //刷新配置
@RequestMapping("/config")
@RestController
public class ConfigTestController {

    @Value("${com.william.config.enable}")
    private String testConfig;

    @GetMapping("/getconfig")
    private String getConfig(){
        return "测试配置："+testConfig;
    }

}
