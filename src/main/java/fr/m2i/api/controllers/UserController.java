package fr.m2i.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/user/{username}")
	public String getUserPage(@PathVariable("username") String username)
	{
		String buildresult = "Page for "+ username;
		System.out.println(buildresult);
		return "OK";
	}
	
	@PostMapping("/user")
	public String postUser(@RequestBody String username)
	{
		String buildresult = username + " is created";
		System.out.println(buildresult);
		return "OK";
	}
}
