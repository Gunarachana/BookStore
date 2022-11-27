package com.bookStore.BookStore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.bookStore.BookStore.exception.BookException;
import com.bookStore.BookStore.model.Book;
import com.bookStore.BookStore.repository.BookRepository;

public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public Book addBook(Book book)
	{
		return bookRepository.save(book);
	}
	
	@Override
	public Book updateBook(Book book)
	{
		Optional<Book> bookObj = this.bookRepository.findById(book.getBookId());
		
		if(bookObj.isPresent())
		{
			Book bookUpdate = bookObj.get();
			bookUpdate.setBookId(book.getBookId());
			bookUpdate.setBookName(book.getBookName());
			bookUpdate.setBookAuthor(book.getBookAuthor());
			bookUpdate.setBookPrice(book.getBookPrice());
			bookUpdate.setDepartment(book.getDepartment());
			bookUpdate.setBookQuantity(book.getBookQuantity());
			bookUpdate.setReviews(book.getReviews());
			return this.bookRepository.save(bookUpdate);
		}
		else
		{
			throw new BookException("Book with this ID is not found"+book.getBookId());
		}
	}
	
	@Override
	public List<Book> getBooks()
	{
		return this.bookRepository.findAll();
	}
	
	@Override
	public Book getBookId(long bookId)
	{
		Optional<Book> bookObj = this.bookRepository.findById(bookId);
		if(bookObj.isPresent())
		{
			return bookObj.get();
		}
		else
		{
			throw new BookException("Book not found with this ID "+bookId);
		}
	}
	
	@Override
	public void deleteBook(long bookId)
	{
		Optional<Book> bookObj = this.bookRepository.findById(bookId);
		if(bookObj.isPresent())
		{
			this.bookRepository.deleteById(bookId);
		}
		else
		{
			throw new BookException("Book not found with this ID "+bookId);
		}
	}
	

}
