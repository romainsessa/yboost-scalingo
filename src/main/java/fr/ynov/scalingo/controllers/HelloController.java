package fr.ynov.scalingo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping
	public String helloWorld()  {
		return "hello world";
	}
	
}
