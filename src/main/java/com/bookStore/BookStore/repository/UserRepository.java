package com.bookStore.BookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookStore.BookStore.model.Users;

public interface UserRepository extends JpaRepository<Users,Long>{

}
