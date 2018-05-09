package com.lr.springMVC.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorld {
	
	@RequestMapping(value="/helloWorld", method=RequestMethod.POST)
	public String hello() {
		System.out.println("hello");
		return "success";
	}
}
