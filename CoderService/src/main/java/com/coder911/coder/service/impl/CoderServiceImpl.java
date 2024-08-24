package com.coder911.coder.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coder911.coder.data.CoderData;
import com.coder911.coder.dto.CoderDTO;
import com.coder911.coder.entity.Coder;
import com.coder911.coder.mapping.data.Mapping;
import com.coder911.coder.repository.CoderRepository;
import com.coder911.coder.service.CoderService;
import com.coder911.coder.util.EncryptionUtil;

@Service
public class CoderServiceImpl implements CoderService {

	@Autowired
	private CoderRepository coderRepository;
	
	@Override
	public boolean verifyLogin(CoderData coderData) {
		Coder coder = Mapping.getEntity(coderData);
		Coder verifyUser = coderRepository.findByEmail(coder.getEmail());
		if (verifyUser != null) {
			return EncryptionUtil.verifyPassword(coder.getPassword(), verifyUser.getPassword());
		}
		return verifyUser != null;
	}

	@Override
	public CoderData saveCoder(CoderData coderData) {
		try {
			Coder coder = Mapping.getEntity(coderData);
			coder.setPassword(EncryptionUtil.enrcyptPassword(coder.getPassword()));
			Coder savedCoder = coderRepository.save(coder);
			if (savedCoder != null) {
				return Mapping.getObject(savedCoder);
			}
		} catch(Exception exception) {
			exception.printStackTrace();
			throw new RuntimeException("Cannot save user");
		}
		return null;
	}

}
