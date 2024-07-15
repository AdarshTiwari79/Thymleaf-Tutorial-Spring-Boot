package com.boot.thymleafPractical.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	// basics with variable in thymeleaf
	@GetMapping("/about")
	public String about(Model model) {
		System.out.println("Inside about handler new....");
		model.addAttribute("name", "Adarsh Tiwari");
		model.addAttribute("currentDate", new Date().toString());

		return "about";
		// return page about.html
	}

	// for loop in thymeleaf
	@GetMapping("/loop")
	public String loopHandler(Model m) {
		
		System.out.println("loop handler is running...");
		List<String> friends = List.of("Adarsh Tiwari","Rahul Tiwari","Sachin Tiwari","Bhanu Pratap Tiwari");
		m.addAttribute("friends",friends);
		return "loop";
	}
}
