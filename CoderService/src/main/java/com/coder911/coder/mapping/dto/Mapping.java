package com.coder911.coder.mapping.dto;

import com.coder911.coder.data.CoderData;
import com.coder911.coder.dto.CoderDTO;

public class Mapping {

	public static CoderData getObject(CoderDTO coderDTO) {
		
		if (coderDTO != null) {
			CoderData coderData = new CoderData();
			coderData.setUserName(coderDTO.getUserName());
			coderData.setEmail(coderDTO.getEmail());
			coderData.setPassword(coderDTO.getPassword());
			return coderData;
		}
		
		return null;
	}

	public static CoderDTO getDTO(CoderData coderData) {
		
		if (coderData != null) {
			CoderDTO coderDTO = new CoderDTO();
			coderDTO.setUserName(coderData.getUserName());
			coderDTO.setEmail(coderData.getEmail());
			return coderDTO;
		}
		
		return null;
	}

}
