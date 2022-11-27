package com.bookStore.BookStore.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="books")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bookId;
	
	@Column(name="bookName")
	private String bookName;
	
	@Column(name="bookAuthor")
	private String bookAuthor;
	
	@Column(name="bookPrice")
	private long bookPrice;
	
	@Column(name="bookQuantity")
	private int bookQuantity;
	
	@Column(name="department")
	private String department;
	
	@Column(name="reviews")
	private double reviews;

	public Book(long bookId, String bookName, String bookAuthor, long bookPrice, int bookQuantity,String department) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.bookQuantity = bookQuantity;
		this.department = department;
	}

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public long getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(long bookPrice) {
		this.bookPrice = bookPrice;
	}

	public int getBookQuantity() {
		return bookQuantity;
	}

	public void setBookQuantity(int bookQuantity) {
		this.bookQuantity = bookQuantity;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	

	public double getReviews() {
		return reviews;
	}

	public void setReviews(double reviews) {
		this.reviews = reviews;
	}

	@Override
	public String toString() {
		return "BookInfo [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookPrice="
				+ bookPrice + ", bookQuantity=" + bookQuantity + "department = "+department +"reviews = " +reviews+ "]";
	}
	
}
