package com.sanket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanket.model.Contact;

public interface ContactsRepo extends JpaRepository<Contact, Integer> {

}
