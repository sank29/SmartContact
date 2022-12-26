package com.sanket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanket.model.Contacts;

public interface ContactsRepo extends JpaRepository<Contacts, Integer> {

}
