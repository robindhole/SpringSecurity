package com.codenetworkz.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class HomeController {

	@RequestMapping("/home")
	public String index() {
		return "index";
	}
	
}
