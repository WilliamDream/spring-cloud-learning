package com.william.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: williamdream
 * @Description:
 */

@RequestMapping("/config")
@RestController
public class ConfigTestController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/getport")
    private String getConfigServer(){
        return "端口："+port;
    }

}
