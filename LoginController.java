package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.LoginService;

@RestController
@RequestMapping("/Sign in")
public class LoginController {
	@Autowired
	private LoginService loginService;
	@GetMapping()
	public String loginCredentails(@RequestParam String userName,@RequestParam String password) {
	return loginService.validate(userName,password);
	}

}
