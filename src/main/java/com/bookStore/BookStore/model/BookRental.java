package com.bookStore.BookStore.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name="bookRental")
public class BookRental {

	@Column(name="bookId",nullable=false , unique=true)
	private long bookId;
	
	@Column(name="userId",nullable=false , unique=true)
	private long userId;
	
	@Column(name="issuedDate",columnDefinition="TIMESTAMP" ,nullable=false)
	private LocalDateTime issuedDate;
	
	@Column(name="returnDate",columnDefinition="TIMESTAMP" ,nullable=false)
	private LocalDateTime returnDate;
	
	@Column(name="amountToBePaid",nullable=false)
	private long amountToBePaid;

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public LocalDateTime getIssuedDate() {
		return issuedDate;
	}

	public void setIssuedDate(LocalDateTime issuedDate) {
		this.issuedDate = issuedDate;
	}

	public LocalDateTime getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(LocalDateTime returnDate) {
		this.returnDate = returnDate;
	}

	public long getAmountToBePaid() {
		return amountToBePaid;
	}

	public void setAmountToBePaid(long amountToBePaid) {
		this.amountToBePaid = amountToBePaid;
	}
	
	
}
