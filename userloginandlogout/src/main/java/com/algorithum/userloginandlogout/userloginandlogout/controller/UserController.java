package com.algorithum.userloginandlogout.userloginandlogout.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.algorithum.userloginandlogout.userloginandlogout.service.UserService;

@RestController

public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/login")
	public String login(@RequestParam("usrname") String userName,@RequestParam("password") String userPassword) {
		String str = userService.login(userName,userPassword);
		return str;
		
	}
	
	
	
	
	
	
	
	
	

}
