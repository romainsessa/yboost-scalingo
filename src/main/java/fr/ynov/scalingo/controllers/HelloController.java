package fr.ynov.scalingo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@Value("${custom}")
	private String customEnvVariable;
	
	@GetMapping
	public String helloWorld(Model model)  {
		model.addAttribute("customEnvVariable", customEnvVariable);
		return "index";
	}
	
}
