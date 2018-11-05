package com.forezp.web;

import com.forezp.util.RedisUtils;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;


@RestController
@RequestMapping("/hello")
public class HelloController {

	@Value("${server.port}")
	String port;

	@Autowired
	private RedisUtils redisUtils;

	/**
	 * hello
	 *
	 * @param name
	 * @return
	 */
	@GetMapping("/hi")
	public String home(@RequestParam String name) {
		System.out.println("------------------");
		return "hi " + name + ",i am from port:" + port;
	}

	@RequestMapping("/test")
	public String  test(){
		redisUtils.set("123", "hello world");
		System.out.println("进入了方法");
		String string= redisUtils.get("123").toString();
		return string;
	}

	/**
	 * 测试断路器
	 *
	 * @return
	 */
	@RequestMapping("/Hystrix")
	@HystrixCommand(fallbackMethod = "hystrixErr")
	public String methodHystrix() {
		return "ret:" + new Random().nextInt(1000);
	}

	private String hystrixErr() {
		return "sorry server invoke err";
	}
}
