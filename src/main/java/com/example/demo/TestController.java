package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/index")
	public String index() {
		
		System.out.println("111");
		
		return "index";
	}
	

	@RequestMapping("/test")
	public String test() {
		
		return "test";
	}
	
}
