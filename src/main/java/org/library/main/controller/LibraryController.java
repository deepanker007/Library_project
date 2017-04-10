package org.library.main.controller;

import org.library.main.entity.Book;
import org.library.main.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/library")
public class LibraryController {
	
	@Autowired
	private LibraryRepository libraryRepository;
	
	@GetMapping
	public String getRecords() {
		return "Hello Library";
	}
	
	@PostMapping
	public String saveRecords(@RequestBody Book book) {
		libraryRepository.saveRecord(book);
		return "Successful";
		
	}

}
