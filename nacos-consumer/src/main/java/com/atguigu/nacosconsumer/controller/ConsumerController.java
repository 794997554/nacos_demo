package com.atguigu.nacosconsumer.controller;

import com.atguigu.nacosconsumer.feign.ProveiderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private ProveiderFeign proveiderFeign;

    @GetMapping("/hi")
    public String hi() {
        String hello = proveiderFeign.hello();
        return "hi" + hello;
    }
}
