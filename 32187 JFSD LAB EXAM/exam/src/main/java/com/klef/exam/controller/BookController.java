package com.klef.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.exam.services.Bookservice;
import com.klef.jfsd.exam.models.Book;

@RestController
@RequestMapping("api")
public class BookController {
	@Autowired
	private Bookservice bookservice;
	
	@PutMapping("/{id}")
	public String updateUser(@RequestBody Book book,@PathVariable("Id") int id) {
		return bookservice.updateBook(book);
	}
}
