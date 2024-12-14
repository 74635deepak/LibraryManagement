package com.example.LibraryManagement;

import java.util.List;

public interface LibService {

	Book addBook(Book book);
	Book getBookById(Integer id);
	List<Book> getAllBooks();
	Book updateBook(Book book,Integer id);
	void deleteBook(Integer id);
}
