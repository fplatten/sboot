package com.first.sboot.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.first.sboot.domain.Basic;

@Controller
@RequestMapping(value = "/basic", produces = MediaType.APPLICATION_JSON_VALUE)
public class BasicController {
	
	
	@RequestMapping
	public @ResponseBody Basic basic() {
		
		Basic basic = new Basic();
		basic.setMessage("Second Message");
		
		return basic;
	}

}
