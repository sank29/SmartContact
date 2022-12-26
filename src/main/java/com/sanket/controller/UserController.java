package com.sanket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sanket.exceptions.UserException;
import com.sanket.model.User;
import com.sanket.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/saveUser")
	public ResponseEntity<User> saveUser(@RequestBody User user) throws UserException{
		
		User savedUser = userService.addUser(user);
		
		return new ResponseEntity<User>(savedUser, HttpStatus.ACCEPTED);
		
	}
	
	@PostMapping("/updateUser")
	public ResponseEntity<User> updateUser(@RequestBody User user) throws UserException{
		
		User updatedUser = userService.updateUser(user);
		
		return new ResponseEntity<User>(updatedUser, HttpStatus.ACCEPTED);
		
	}

}
