package com.tao.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Configuration
@SpringBootApplication
public class HelloWorld {
	
	@RequestMapping("hello")
	@ResponseBody
	public String hello() {
		return "hello2";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(HelloWorld.class, args);
	}
	
}
