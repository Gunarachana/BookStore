package com.bookStore.BookStore.controller;

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

import com.bookStore.BookStore.model.Book;
import com.bookStore.BookStore.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/book")
	private ResponseEntity<List<Book>> getAllBooks()
	{
		return ResponseEntity.ok().body(this.bookService.getBooks());
	}
	
	@GetMapping("/book/bookId")
	private Book getBookById(@PathVariable long bookId)
	{
		return this.bookService.getBookId(bookId);
	}
	
	@PostMapping("/addbook")
	private ResponseEntity<Book> saveBooks(@RequestBody Book book)
	{
		return ResponseEntity.ok().body(this.bookService.addBook(book));
	}

	@PutMapping("/addbook/{bookId}")
	private ResponseEntity<Book> updateBook(@PathVariable int bookId,@RequestBody Book book)
	{
		book.setBookId(bookId);
		return ResponseEntity.ok().body(this.bookService.updateBook(book));
	}
	
	@DeleteMapping("/addbook/{bookId}")
	private HttpStatus deleteBook(@PathVariable long bookId)
	{
		this.bookService.deleteBook(bookId);
		return HttpStatus.OK;
	}
}
