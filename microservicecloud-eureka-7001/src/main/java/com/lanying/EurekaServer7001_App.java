package com.lanying;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7001_App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001_App.class, args);
        // 开启后，如果浏览器输入<http://localhost:7001> 能够显示Spring Eureka则说明服务注册中心（类似物业公司）启动成功
    }
}

