package com.example.LibraryManagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibServiceImpl implements LibService{
	
	@Autowired
	private LibRepository libRepository;

	@Override
	public Book addBook(Book book) {
		Book savedBook= libRepository.save(book);
		return savedBook;
	}

	@Override
	public Book getBookById(Integer id) {
		Book book =libRepository.findById(id).orElseThrow(()->new RuntimeException());
		return book;
	}

	@Override
	public List<Book> getAllBooks() {
		List<Book> books = libRepository.findAll();
		return books;
	}

	@Override
	public Book updateBook(Book book, Integer id) {
		Book recBook =libRepository.findById(id).orElseThrow(()->new RuntimeException());
		recBook.setName(book.getName());
		recBook.setAuthor(book.getAuthor());
		recBook.setAbout(book.getAbout());
		
		Book sBook=libRepository.save(recBook);
		return sBook;
	}

	@Override
	public void deleteBook(Integer id) {
		libRepository.deleteById(id);
	}

}
