package com.example.LibraryManagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class LibController {
	
	@Autowired
	private LibService libService;

	@PostMapping("/add")
	public ResponseEntity<Book> addBook(@Valid @RequestBody Book book){
		Book savedBook = libService.addBook(book);
		return new ResponseEntity<Book>(savedBook, HttpStatus.CREATED);
	}
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<Book> getBookById(@Valid @PathVariable Integer id){
		Book book= libService.getBookById(id);
		return new ResponseEntity<Book>(book, HttpStatus.FOUND);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Book>> getAllBooks(){
		List<Book> allBooks=libService.getAllBooks();
		return new ResponseEntity<List<Book>>(allBooks, HttpStatus.FOUND);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Book> updateBook(@Valid @RequestBody Book book, @PathVariable Integer id){
		Book updatedBook = libService.updateBook(book, id);
		return new ResponseEntity<Book>(updatedBook, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteBook(@Valid @PathVariable Integer id){
		libService.deleteBook(id);
		return new ResponseEntity<String>("Book of id "+ id+ " is Deleted", HttpStatus.OK);
	}
		
	
}
