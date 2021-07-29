package com.springboot.fundraising.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.ModelAndView;

import com.springboot.fundraising.repository.Donor;

@Controller
public class HomeController {
	
//	@RequestMapping("/home")
//	public String home() {
//		
//		return "home";
//	}
	
	@RequestMapping("/")
	public String home() {
		
		return "home";
	}
	
//	@GetMapping("/login")
//	public ModelAndView login() {
//	   ModelAndView mv=new ModelAndView("login");
//	   return mv;
//	}
	
	@RequestMapping("/login")
	public String login() {		
		return "login";
	}
	
	@RequestMapping("/register")
	public String register() {
		
		return "register";
	}
	
//	@RequestMapping("/error")
//	public String errorpage() {
//		
//		return "error";
//	}
	
	@RequestMapping(path="/donorform", method = RequestMethod.POST)
	public String donorData(@ModelAttribute("Donor") Donor donor,Model modal) {
		
		System.out.println(donor);
		return "";
	}

}
