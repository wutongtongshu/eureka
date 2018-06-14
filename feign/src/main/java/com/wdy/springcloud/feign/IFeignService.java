package com.wdy.springcloud.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created on 2018/6/14 13:23
 * <p>Title:       []/p>
 * <p>Description: []</p>
 * <p>Company:     羚羊极速</p>
 *
 * @author [wudey]
 * @version 1.0
 */

@FeignClient("service")
public interface IFeignService {

    @RequestMapping("/hello")
    String hellofeign();

    @RequestMapping("/feignparam")
    String feignParamsTest(@RequestParam(value="name") String s);
}
