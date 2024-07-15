package com.boot.thymleafPractical.controller;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;




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
	
	// Conditional in thymeleaf
	@GetMapping("/conditional")
	public String conditionalHandler(Model m) {
		System.out.println("conditional handler is running....");
		List<Integer> numbers = List.of(2,3,4,5,6,7);
		m.addAttribute("num",numbers);
		String gender = "F";
		m.addAttribute("gen",gender);
		return "conditional";
	}
	
	// for fragment implementation
	
	@GetMapping("/host-fragment")
	public String fragmentHandler(Model model) {
		System.out.println("host fragment handler is running....");
		model.addAttribute("title","this is dynamic title");
		model.addAttribute("sub",LocalDateTime.now().toString());		
		return "hostFragment";
	}
	
	// for inheritance implementation
	@GetMapping("/inheritance")
	public String inheritenceHandler() {
		System.out.println("This is inheritence handler running....");
		return "contactus";
	}
	
	
	
}
