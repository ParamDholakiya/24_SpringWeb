package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.UserBean;

@Controller
public class SessionController {
	// Login
	@GetMapping("/login")
	public String login(){
		return "login";
	}
	
	// Signup
	@GetMapping("/signup")
	public String signup() {
		
		return "signup";
	}
	
	// Forget Password
	@GetMapping("/forgetPassword")
	public String forgetPassword() {
		return "forgetPassword";
	}
	
	// saveUser()
	@PostMapping("/saveUser")
	public String saveUser(UserBean userBean, Model model) {
		
		System.out.println("User Name: " + userBean.getFirstName());
		System.out.println("User Email: " + userBean.getEmail());
		System.out.println("User Password: " + userBean.getPassword());
		
		model.addAttribute("userBean", userBean);
		
		return "RegistrationDetails";
	}
}
