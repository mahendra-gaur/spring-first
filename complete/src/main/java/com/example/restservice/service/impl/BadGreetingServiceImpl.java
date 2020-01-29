package com.example.restservice.service.impl;

import org.springframework.stereotype.Component;

import com.example.restservice.service.Greeting;

@Component(value = "deepak")
public class BadGreetingServiceImpl implements Greeting {

	@Override
	public String getMsg() {
		return "Bad Morning";
	}

}
