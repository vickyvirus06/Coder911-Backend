package com.coder911.coder.mapping.data;

import com.coder911.coder.data.CoderData;
import com.coder911.coder.entity.Coder;
import com.coder911.coder.entity.CoderId;

public class Mapping {

	public static Coder getEntity(CoderData coderData) {
		
		if (coderData != null) {
			Coder coder = new Coder();
			CoderId coderId = new CoderId();
			coderId.setUserName(coderData.getUserName());
			coderId.setEmail(coderData.getEmail());
			coderId.setPassword(coderData.getPassword());
			coder.setId(coderId);
			return coder;
		}
		return null;
	}

	public static CoderData getObject(Coder coder) {
		
		if (coder != null) {
			CoderId coderId = coder.getId();
			CoderData coderData = new CoderData();
			coderData.setUserName(coderId.getUserName());
			coderData.setEmail(coderId.getEmail());
			coderData.setPassword(coderId.getPassword());
			return coderData;
		}
		return null;
	}

	public static CoderId getId(CoderData coderData) {
		
		if (coderData != null) {
			CoderId coderId = new CoderId();
			coderId.setUserName(coderData.getUserName());
			coderId.setEmail(coderData.getEmail());
			coderId.setPassword(coderData.getPassword());
			return coderId;
		}
		return null;
	}

}
