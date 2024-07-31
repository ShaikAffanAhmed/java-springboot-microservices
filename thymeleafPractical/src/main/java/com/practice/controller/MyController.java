package com.practice.controller;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	// http://localhost:8282/about

	@SuppressWarnings("deprecation")
	@GetMapping(value = "/about")
	public String about(Model model) {
		System.out.println("Inside about handler");
		// putting data in model
		model.addAttribute("name", "Thor");
		model.addAttribute("CurrentDate", new Date().toLocaleString());
		return "about";
		// about.html
	}

	// handling Iteration
	@GetMapping("/example-loop")
	public String iterationHandler(Model m) {
		// send

		// create a list, set collection

		List<String> names = List.of("Bob", "Charty", "Dibya");
		m.addAttribute("names", names);
		return "iterate";
	}

	// handler for conditional statements
	@GetMapping("/condition")
	public String conditionHandler(Model m) {
		System.out.println("Conditional Handler Executed...");
		m.addAttribute("isActive", false);
		m.addAttribute("Gender", "M");

		List<Integer> list = List.of(23, 56, 75, 78, 99);
		m.addAttribute("myList", list);
		return "condition";
	}

	// handler for including fragments
	@GetMapping("/service")
	public String servicesHandler(Model m) {
		m.addAttribute("title", "I like to eat Mango");
		m.addAttribute("subtitle", LocalDateTime.now().toString());
		// processing logic
		return "service";
	}

	// for new about
	@GetMapping("/newabout")
	public String newAbout() {
		return "aboutnew";
	}	
	
	
	//for contact
	@GetMapping("/contact")
	public String contact()
	{
		return "contact";
	}

}
