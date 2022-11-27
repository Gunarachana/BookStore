package com.bookStore.BookStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.bookStore.BookStore.model.Users;
import com.bookStore.BookStore.service.UserService;

public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/user/add")
	private ResponseEntity<Users> addUser(@RequestBody Users user)
	{
		return ResponseEntity.ok().body(this.userService.createUser(user));
	}

	@PutMapping("/user/update/{userId}")
	private ResponseEntity<Users> updateUSer(@PathVariable int userId,@RequestBody Users user)
	{
		user.setUserId(userId);
		return ResponseEntity.ok().body(this.userService.updateUser(user));
	}
	
	@PutMapping("/user/suspend/{userId}")
	private ResponseEntity<Users> suspendUser(@PathVariable int userId,@RequestBody Users user)
	{
		user.setUserId(userId);
		return ResponseEntity.ok().body(this.userService.suspendUser(user));
	}
	
}
