package com.demo.springsecurity.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/security")
public class ApplicaitonController {
	
	@GetMapping("/enabled")
	public String apiTest() {
		return "The security is working!";
	}

}
