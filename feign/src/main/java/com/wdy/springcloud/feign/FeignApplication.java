package com.wdy.springcloud.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableFeignClients
@SpringBootApplication
@EnableEurekaClient
@RestController
@RequestMapping("/")
public class FeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class, args);
    }

    @Autowired
    public IFeignService service;

    @GetMapping("/hellofeign")
    public String hello()
    {
        return service.hellofeign();
    }

    @GetMapping("/feignparam")
    public String feignparam()
    {
        return service.feignParamsTest("wudeyun");
    }
}
