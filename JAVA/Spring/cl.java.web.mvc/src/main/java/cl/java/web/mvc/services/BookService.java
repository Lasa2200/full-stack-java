package cl.java.web.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import cl.java.web.mvc.models.Book;
import cl.java.web.mvc.respositories.BookRepository;



@Service
public class BookService {
	//Agregando el book al repositorio como una dependencia
	private final BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	//Devolviendo todos los libros.
	public List<Book> allBooks() {
		return bookRepository.findAll();
	}
	//Creando un libro.
	public Book createBook(Book b) {
		return bookRepository.save(b);
	}
	//Obteniendo la información de un libro
	public Book findBook(Long id) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		if(optionalBook.isPresent()) {
			return optionalBook.get();
		} else {
			return null;
		}
	}
}

