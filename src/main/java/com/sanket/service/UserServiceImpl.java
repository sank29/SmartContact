package com.sanket.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanket.exceptions.UserException;
import com.sanket.model.User;
import com.sanket.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepo userDao;

	@Override
	public User addUser(User user) throws UserException {
		
		
		
		if(user != null) {
			
			User savedUser = userDao.save(user);
			
			return savedUser;
			
		}else {
			
			throw new UserException("Please enter valid user");
		}
		
	}

	@Override
	public User updateUser(User user) throws UserException {
		
		Optional<User> foundUser = userDao.findById(user.getUserId());
		
		if(foundUser.isPresent()) {
			
			User updatedUser = userDao.save(user);
			
			return updatedUser;
			
		}else {
			
			throw new UserException("No user found with this user id " + user.getUserId());
			
		}
	}

}
