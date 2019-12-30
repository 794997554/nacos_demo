package com.atguigu.nacosconsumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("nacos-provider")
public interface ProveiderFeign {

    @GetMapping(value = "/hello")
    public String hello();
}
