package com.coder911.coder.mapping.data;

import com.coder911.coder.data.CoderData;
import com.coder911.coder.entity.Coder;
import com.coder911.coder.util.EncryptionUtil;

public class Mapping {

	public static Coder getEntity(CoderData coderData) {
		
		if (coderData != null) {
			Coder coder = new Coder();
			coder.setUserName(coderData.getUserName());
			coder.setEmail(coderData.getEmail());
			coder.setPassword(coderData.getPassword());
			return coder;
		}
		return null;
	}

	public static CoderData getObject(Coder coder) {
		
		if (coder != null) {
			CoderData coderData = new CoderData();
			coderData.setUserName(coder.getUserName());
			coderData.setEmail(coder.getEmail());
			coderData.setPassword(coder.getPassword());
			return coderData;
		}
		return null;
	}

}
