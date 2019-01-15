package com.andy.routeproject.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/{path}")
	public String dojoInfo(@PathVariable("path") String path) {
		if("dojo".equals(path)) {
			return "The dojo is awesome!";
		} 
		if("burbank-dojo".equals(path)) {
			return "Burbank Dojo is located in Southern California.";
		} 
		if("san-jose".equals(path)) {
			return "SJ dojo is the headquarters";
		}
		return "error";
	}
}
