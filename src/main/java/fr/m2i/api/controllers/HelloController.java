package fr.m2i.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/")
	public String getHome() {
		return "Home";
	}
	
	@GetMapping("/hello")
	public String getHello() {
		return "Hello World";
	}	

}
