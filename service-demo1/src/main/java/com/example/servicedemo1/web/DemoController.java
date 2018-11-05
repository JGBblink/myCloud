package com.example.servicedemo1.web;

import com.example.servicedemo1.service.Demo2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@Autowired
	Demo2Service demo2Service;

	@RequestMapping(value = "/hello",method = RequestMethod.GET)
	public String helloMethod(@RequestParam String name) {
		System.out.println("===>" + name);
		return demo2Service.hello(name);
	}
}
