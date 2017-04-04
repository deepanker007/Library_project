package org.library.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/library")
public class LibraryController {
	
	@GetMapping
	public String getRecords() {
		return "Hello Library";
	}
	
	@PostMapping
	public String saveRecords() {
		return null;
		
	}

}
