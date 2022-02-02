package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Template.ContactTemplate;

public interface PhoneBookList extends CrudRepository<ContactTemplate, Integer>{

}
