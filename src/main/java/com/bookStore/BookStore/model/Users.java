package com.bookStore.BookStore.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userId;
	@Column(name = "userName")
	private String userName;
	@Column(name = "userMail")
	private String userMail;
	@Column(name = "userPhno")
	private String userPhno;
	@Column(name="userStatus")
	private Boolean userStatus;
	@Column(name="wallet")
	private double wallet;
	
	public Users(long userId, String userName, String userMail, String userPhno,Boolean userStatus,Double wallet) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userMail = userMail;
		this.userPhno = userPhno;
		this.userStatus = userStatus;
		this.wallet = wallet;
	}
		
	public void setUserId(long userId) {
		this.userId = userId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	public void setUserPhno(String userPhno) {
		this.userPhno = userPhno;
	}

	public long getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserMail() {
		return userMail;
	}

	public String getUserPhno() {
		return userPhno;
	}

	public Boolean getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(Boolean userStatus) {
		this.userStatus = userStatus;
	}

	public double getWallet() {
		return wallet;
	}

	public void setWallet(double wallet) {
		this.wallet = wallet;
	}

	@Override
	public String toString() {
		return "BookBeans [userId=" + userId + ", userName=" + userName + ", userMail=" + userMail + ", userPhno="
				+ userPhno + "userStatus = " +userStatus+"wallet"+wallet+"]";
	}
	
	
}
