package com.bookStore.BookStore.service;

import java.util.List;

import com.bookStore.BookStore.model.Book;

public interface BookService {

	Book addBook(Book book);
	Book updateBook(Book book);
	void deleteBook(long bookId);
	Book getBookId(long bookId);
	List<Book> getBooks();
}
