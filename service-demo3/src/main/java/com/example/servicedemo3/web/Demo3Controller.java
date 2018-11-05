package com.example.servicedemo3.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo3")
public class Demo3Controller {


	@RequestMapping("/hello")
	public String hello(String name) {
		System.out.println("==>" + name);
		return "demo3 " + name;
	}
}
