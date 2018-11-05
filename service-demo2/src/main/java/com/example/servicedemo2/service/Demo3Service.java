package com.example.servicedemo2.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("service-demo3")
public interface Demo3Service {

	@RequestMapping("/demo3/hello")
	String hello(@RequestParam(value = "name") String name);
}
