package com.bookStore.BookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookStore.BookStore.model.Book;

public interface BookRepository extends JpaRepository<Book,Long>{
	

}
