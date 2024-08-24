package com.coder911.queries.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coder911.queries.entity.QueryLanguage;
import com.coder911.queries.repository.QueryLanguageRepo;
import com.coder911.queries.service.QueryLanguageTypeService;

@Service
public class QueryLanguageTypeServiceImpl implements QueryLanguageTypeService {

	@Autowired
	private QueryLanguageRepo queryLanguageRepo;
	
	@Override
	public List<String> fetchAllProgrammingLanguage() {
		List<QueryLanguage> queryLanguages = queryLanguageRepo.findAll();
		return queryLanguages.stream().map(QueryLanguage::getLanguageName).collect(Collectors.toList());
	}

}
