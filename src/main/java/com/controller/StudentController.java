package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.StudentBean;

@Controller
public class StudentController {
    @GetMapping("/BoxCricketRegistration")
    public String registerStudent() {
        return "BoxCricketRegistration"; // Name of the JSP file
    }
    
    @PostMapping("/BoxCricketRegistration")
    public String saveStudent(StudentBean studentBean, Model model) {
        System.out.println("Student Name: " + studentBean.getName());
        System.out.println("Student Email: " + studentBean.getEmail());
        System.out.println("Student Role: " + studentBean.getRole());
        System.out.println("Student Refreshments: " + studentBean.getRefreshments());
        
        boolean validInput = false;
		if (studentBean.getName() != null && studentBean.getName().length() > 0 && studentBean.getName().trim().length() > 0) {
			validInput = true;
		}
        
		if (studentBean.getEmail() != null && studentBean.getEmail().length() > 0
				&& studentBean.getEmail().trim().length() > 0 && studentBean.getEmail().contains("@")) {
			validInput = true;
		}
		
		if (studentBean.getRole() != null && studentBean.getRole().length() > 0
				&& studentBean.getRole().trim().length() > 0) {
			validInput = true;
		}
		

		if (validInput) {
			model.addAttribute("message", "Student details saved successfully");
			model.addAttribute("studentBean", studentBean);
			return "RegistrationDetails";
		} else {
			model.addAttribute("message", "Invalid input, please try again");
			return "BoxCricketRegistration";
		}
		
        

    }
}
