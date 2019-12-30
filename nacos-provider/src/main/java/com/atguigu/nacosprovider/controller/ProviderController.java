package com.atguigu.nacosprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RefreshScope
public class ProviderController {

    @Value("${myName}")
    private String myName;
    @Value("${jdbc.url}")
    private String jdbcUrl;
    @Value("${redis.url}")
    private String redisUrl;

    @GetMapping(value = "/hello")
    public String hello(HttpServletRequest request){
        System.out.println(request.getRequestURI());
        System.out.println(request.getRequestURL().toString());
        return "hello" + myName + ",jdbcUrl:" + jdbcUrl + ",redisUrl:" + redisUrl;
    }
}
