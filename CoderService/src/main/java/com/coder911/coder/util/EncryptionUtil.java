package com.coder911.coder.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class EncryptionUtil {

	private static BCryptPasswordEncoder bCryptPasswordEncoder;

	@Autowired
	public void setBCryptPasswordEncoder(BCryptPasswordEncoder bCryptPasswordEncoder) {
		EncryptionUtil.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}

	public static String enrcyptPassword(String password) {
		return bCryptPasswordEncoder.encode(password);
	}

	public static boolean verifyPassword(String password, String savedPasswordDb) {
		return bCryptPasswordEncoder.matches(password, savedPasswordDb);
	}

}
