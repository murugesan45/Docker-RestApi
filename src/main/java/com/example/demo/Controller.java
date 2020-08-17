package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/")
	public String message() {
		return "Hello World";
	}
    
	@GetMapping("/{name}")
	public String customMessage(@PathVariable String name) {
		return "Hello " + name;
	}
}
