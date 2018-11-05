package com.forezp.web;

import com.forezp.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fangzhipeng on 2017/4/6.
 */
@RestController
@RequestMapping("/hello")
public class HelloControler {

    @Autowired
    HelloService helloService;

    @Autowired
    TestHttpClient testHttpClient;
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }

    @RequestMapping(value = "/hystrix")
    public String hi2(@RequestParam String name){
        return helloService.hiHystrix(name);
    }


}

