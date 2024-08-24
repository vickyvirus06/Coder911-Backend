package com.coder911.queries.mapping.dto;

import com.coder911.queries.data.QueryData;
import com.coder911.queries.dto.QueryDTO;

public class Mapping {

	public static QueryData getObject(QueryDTO queryDTO) {
		
		if (queryDTO != null) {
			QueryData queryData = new QueryData();
			queryData.setEmail(queryDTO.getEmail());
			queryData.setSelectedLanguage(queryDTO.getSelectedLanguage());
			queryData.setQueryTitle(queryDTO.getQueryTitle());
			queryData.setQueryDescription(queryDTO.getQueryDescription());
			return queryData;
		}
		
		return null;
	}

}
