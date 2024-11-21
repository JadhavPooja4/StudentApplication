package com.algorithum.userloginandlogout.userloginandlogout.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.algorithum.userloginandlogout.userloginandlogout.entity.User;
import com.algorithum.userloginandlogout.userloginandlogout.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepo userRepo;

	@Override
	public String login(String userName, String userPassword) {
		String user=userRepo.getUserNameAndPassword(userName,userPassword);

		if(user==null) {
			return "UserName and Password Not Match";
		}else {
			return "Login Successfull....!";
		}
		
	}

	

	

	
		


	
	

	
}
