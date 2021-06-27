package com.shubham.reddis.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
	
	@GetMapping("/show")
	public String showMsg() {
		System.out.println("hello shubham");
		return "WELCOME TO APP";
	}
}
