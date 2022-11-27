package com.bookStore.BookStore.service;

import com.bookStore.BookStore.model.Users;

public interface UserService {

	Users createUser(Users user);
	Users suspendUser(Users user);
	Users updateUser(Users user);
}
