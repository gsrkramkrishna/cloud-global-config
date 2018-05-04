package com.gsrk.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DefaultController {

	@Value("${com.gsrk.message:Hello default}")
	private String message;
	@RequestMapping(value = "/hello", method=RequestMethod.GET)
	public String rootContextURL(){
		System.out.println("Message:"+message);
		return message;
	}
}
