package com.forezp.service;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.rmi.MarshalException;

/**
 * Created by fangzhipeng on 2017/4/6.
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hello/hi?name="+name,String.class);
    }

    @HystrixCommand(fallbackMethod = "hyxtrixErr")
    public String hiHystrix(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hello/Hystrix?name="+name,String.class);
    }

    /**
     * 熔断方法,参数必须要和调用方法参数一致
     * @param name
     * @return
     */
    public String hyxtrixErr(String name) {
        return "service invoke error!";
    }
}
