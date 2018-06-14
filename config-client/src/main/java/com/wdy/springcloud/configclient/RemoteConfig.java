package com.wdy.springcloud.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RemoteConfig
{
    @Value("${phase}")
    private String phase;

    @RequestMapping("/test")
    public String test()
    {
        return phase;
    }
}
