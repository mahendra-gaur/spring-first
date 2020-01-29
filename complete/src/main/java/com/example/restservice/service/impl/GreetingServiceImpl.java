package com.example.restservice.service.impl;

import org.springframework.stereotype.Component;

import com.example.restservice.service.Greeting;

@Component(value = "mahend")
public class GreetingServiceImpl implements Greeting{

	@Override
	public String getMsg() {
		return "Good Morning";
	}

}
