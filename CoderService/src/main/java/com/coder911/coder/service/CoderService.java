package com.coder911.coder.service;

import com.coder911.coder.data.CoderData;
import com.coder911.coder.dto.CoderDTO;

public interface CoderService {

	public boolean verifyLogin(CoderData coderData);

	public CoderData saveCoder(CoderData coderData);
}
