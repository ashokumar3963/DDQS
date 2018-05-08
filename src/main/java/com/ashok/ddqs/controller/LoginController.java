package com.ashok.ddqs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashok.ddqs.model.User;
import com.ashok.ddqs.service.LoginServiceImpl;

@RestController
@RequestMapping("/user")
public class LoginController {
	
	@Autowired
	private LoginServiceImpl loginServiceImpl;
	
	@GetMapping
	public @ResponseBody Iterable<User> getAllUsers() {
		// This returns a JSON or XML with the users
		return loginServiceImpl.findAll();
	}
	
	@PostMapping
	public String createUser(@RequestBody User user) {
		System.out.println(user.getUserName());
		System.out.println(user.getUserRole());
		
		
		loginServiceImpl.createUser(user);
		
		return "Saved";
	}

}
