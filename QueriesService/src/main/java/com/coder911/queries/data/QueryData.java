package com.coder911.queries.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QueryData {
	
	private String email;
	private String selectedLanguage;
	private String queryTitle;
	private String queryDescription;

}
