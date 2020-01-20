package com.ouhamza.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class StudentResource {
	
	@Autowired
	private StudentRepo repo;
	
	@GetMapping("students")
	public Iterable<Student> getStudents() {
		
		return repo.findAll();
	}

}
