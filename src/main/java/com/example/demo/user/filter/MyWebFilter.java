package com.example.demo.user.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyWebFilter {

    @Bean
    public FilterRegistrationBean testFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new DemoFilter());
        //过滤掉 /getUser 和/hello 的请求
        registration.addUrlPatterns("/getUser", "/hello");
        //过滤掉所有请求
//      registration.addUrlPatterns("/*");
        registration.addInitParameter("paramName", "paramValue");
        registration.setName("DemoFilter");
        registration.setOrder(1);
        return registration;
    }
}