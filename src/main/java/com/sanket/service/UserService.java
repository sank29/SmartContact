package com.sanket.service;

import com.sanket.exceptions.UserException;
import com.sanket.model.User;

public interface UserService {
	
	public User addUser(User user) throws UserException;
	
	public User updateUser(User user) throws UserException;

}
