package com.example.servicedemo1.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-demo2")
public interface Demo2Service {

	@RequestMapping(value = "/demo2/hello",method = RequestMethod.GET)
	String hello(@RequestParam(value = "name") String name);
}
