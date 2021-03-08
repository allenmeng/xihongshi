package com.example.demo.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {
	
	@RequestMapping("/a")
	public String aa() {
		return "ssss";
	}

}
