package com.sanket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanket.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
