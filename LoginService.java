package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public String validate(String userName, String password) {
		if(userName.equals(password))
		return "Sign Authentication Successful";
		else
		return "Wrong Credentials sign in failed try again";
	}
}
