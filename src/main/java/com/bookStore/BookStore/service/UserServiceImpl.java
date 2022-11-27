package com.bookStore.BookStore.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.BookStore.exception.UserException;
import com.bookStore.BookStore.model.Users;
import com.bookStore.BookStore.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public Users createUser(Users user)
	{
		return userRepository.save(user);
	}
	
	@Override
	public Users updateUser(Users user)
	{
		Optional<Users> userObj = this.userRepository.findById(user.getUserId());
		
		if(userObj.isPresent())
		{
			Users userUpdate = userObj.get();
			userUpdate.setUserId(user.getUserId());
			userUpdate.setUserMail(user.getUserMail());
			userUpdate.setUserName(user.getUserName());
			userUpdate.setUserPhno(user.getUserPhno());
			userUpdate.setUserStatus(user.getUserStatus());
			userUpdate.setWallet(user.getWallet());
			return this.userRepository.save(userUpdate);
		}
		else
		{
			throw new UserException("User is not found with this id: "+user.getUserId());
		}
	}
	
	@Override
	public Users suspendUser(Users user)
	{
		Optional<Users> userObj = this.userRepository.findById(user.getUserId());
		
		if(userObj.isPresent())
		{
			Users userUpdate = userObj.get();
			userUpdate.setUserStatus(false);
			return this.userRepository.save(userUpdate);
		}
		else
		{
			throw new UserException("User is not found with this id: "+user.getUserId());

		}
	}
	
	

}
