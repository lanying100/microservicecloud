package com.lanying.springcloud.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration // 加了该注解，则该类相当于一个applicationContext.xml配置文件
public class ConfigBean {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}

/*
    上面的一堆，相当于传统配置文件applicationContext.xml中以下的内容
    <bean id="restTemplate" class="org.springframework.web.client.RestTemplate"/>
 */
