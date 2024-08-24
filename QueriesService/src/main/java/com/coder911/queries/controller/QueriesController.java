package com.coder911.queries.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coder911.queries.data.QueryData;
import com.coder911.queries.dto.QueryDTO;
import com.coder911.queries.mapping.dto.Mapping;
import com.coder911.queries.service.QueriesService;

@RestController
@RequestMapping("/queries")
@CrossOrigin("http://localhost:3000")
public class QueriesController {

	@Autowired
	private QueriesService queriesService;
	
	@PostMapping("/createQuery")
	public ResponseEntity<QueryDTO> createQuery(@RequestBody QueryDTO queryDTO) {
		QueryData queryData = Mapping.getObject(queryDTO);
		QueryData savedQueryData = queriesService.saveQuery(queryData);
		return new ResponseEntity<>(queryDTO, HttpStatus.OK);
	  
	}

	@GetMapping("/test")
	public String test() {
		return "test";
	}
}
