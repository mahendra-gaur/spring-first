package com.example.restservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restservice.service.Greeting;

@RestController
public class GreetingController {

	@Autowired
	@Qualifier(value = "mahend")
	Greeting goodMorning;
	
	@GetMapping("/greeting")
	public String greetSpring() {
		
		String day=null;
				
		if("Good Morning".equals(goodMorning.getMsg())) {
			day="Good day";
		}else {
			day="Bad day";
		}
		
		return day;
	}
	
}
