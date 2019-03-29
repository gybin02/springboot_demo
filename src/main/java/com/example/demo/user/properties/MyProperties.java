package com.example.demo.user.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * https://www.cnblogs.com/xuwujing/p/8485832.html
 * springBoot之配置文件的读取以及过滤器和拦截器的使用
 *
 */
@Component
public class MyProperties {
    /**
     * 获取个人标题
     * 
     */
    @Value("${title}")
    public String title;
    
    /**
     * 获取个人描述
     */
    @Value("${description}")
    public String description;

}