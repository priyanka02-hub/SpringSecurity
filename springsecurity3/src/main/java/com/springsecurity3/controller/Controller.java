package com.springsecurity3.controller;


import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping
	public String home(Authentication  authentication) {
		return  "hello"  + authentication.getName() + "" +authentication.getAuthorities().toString();
		
	}
}
