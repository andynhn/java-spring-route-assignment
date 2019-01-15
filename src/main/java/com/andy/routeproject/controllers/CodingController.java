package com.andy.routeproject.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class CodingController {
	@RequestMapping("")
	public String hello() {
		return "Hello Coding Dojo!";
	}
	@RequestMapping("/python")
	public String pythonGreeting() {
		return "Python/Django was awesome!";
	}
	@RequestMapping("/java")
	public String javaGreeting() {
		return "Java/Spring is better!";
	}
}
