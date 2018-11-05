package com.example.serviceconfigclient.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {


	@Value("${foo}")
	String foo;
	@Value("${name}")
	String name;

	@RequestMapping("/hello")
	public String helloConfig() {
		return "hello ==>" + foo;
	}

	@RequestMapping("/config/name")
	public String getNameConfig() {
		return name;
	}
}
