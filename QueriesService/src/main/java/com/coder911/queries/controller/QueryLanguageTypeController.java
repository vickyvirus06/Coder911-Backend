package com.coder911.queries.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coder911.queries.service.QueryLanguageTypeService;

@RestController
@RequestMapping("/queryLanguageType")
@CrossOrigin("http://localhost:3000")
public class QueryLanguageTypeController {
	
	@Autowired
	private QueryLanguageTypeService queryLanguageTypeService;

	@GetMapping("/fetchProgrammingLanguage")
	public List<String> getProgrammingLanguage() {
		return queryLanguageTypeService.fetchAllProgrammingLanguage();
	}
	
}
