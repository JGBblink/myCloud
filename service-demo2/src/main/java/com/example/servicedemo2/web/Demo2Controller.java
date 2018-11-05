package com.example.servicedemo2.web;

import com.example.servicedemo2.service.Demo3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo2")
public class Demo2Controller {

	@Autowired
	Demo3Service demo3Service;

	@RequestMapping("/hello")
	public String hello(String name) {
		System.out.println("==>" + name);
		return demo3Service.hello(name);
	}
}
