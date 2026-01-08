package fr.ynov.scalingo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.ynov.scalingo.entities.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
