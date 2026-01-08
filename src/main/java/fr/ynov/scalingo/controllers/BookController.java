package fr.ynov.scalingo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.ynov.scalingo.services.BookService;

@Controller
@RequestMapping(value = "/book")
public class BookController {
	
	private BookService bookService;
		
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	@GetMapping
	public String getAllBook(Model model) {
		model.addAttribute("books", bookService.getAll());
		return "books";
	}

}