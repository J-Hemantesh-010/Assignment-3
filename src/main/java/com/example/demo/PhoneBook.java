package com.example.demo;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Procedure.Procedure;
import com.example.demo.Template.ContactTemplate;

@RestController
public class PhoneBook {
	@Autowired
	private Procedure proc;

	@PostMapping("/contact")
	void createContact(@RequestBody @Valid ContactTemplate contact)
	{
		proc.saveContact(contact);
	}
	
	@DeleteMapping("/contact")
	void deleteUser()
	{
		
	}
}
