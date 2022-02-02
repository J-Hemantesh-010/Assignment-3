package com.example.demo.Procedure;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.PhoneBookList;
import com.example.demo.Template.ContactTemplate;

@Service
public class Procedure {
	@Autowired
	PhoneBookList list;
	public void saveContact(@Valid ContactTemplate contact) {
		list.save(contact);
	}
	public Iterable<ContactTemplate> getUser()
	{
		return list.findAll();
	}
	
	public Optional<ContactTemplate> getUser(Integer id)
	{
		return list.findById(id);
	}

}
