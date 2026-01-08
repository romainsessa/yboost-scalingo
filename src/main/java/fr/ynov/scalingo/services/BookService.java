package fr.ynov.scalingo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.ynov.scalingo.entities.Book;
import fr.ynov.scalingo.repositories.BookRepository;

@Service
public class BookService {

	private BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	public List<Book> getAll() {
		return bookRepository.findAll();
	}

}
