package com.coder911.queries.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QueryDTO {
	
	private String email;
	private String selectedLanguage;
	private String queryTitle;
	private String queryDescription;

}
