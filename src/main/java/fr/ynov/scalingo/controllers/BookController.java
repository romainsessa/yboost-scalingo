package fr.ynov.scalingo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.ynov.scalingo.services.BookService;

@Controller
@RequestMapping(value = "/book")
public class BookController {
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Value("${CONTAINER}")
	private String containerId;
	
	private BookService bookService;
		
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	@GetMapping
	public String getAllBook(Model model) {
		logger.error("....");
		logger.info("------------- getAllBook on container : " + containerId);
		model.addAttribute("books", bookService.getAll());
		return "books";
	}

}