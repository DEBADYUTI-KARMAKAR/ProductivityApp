package com.springboot.webapp.productivityapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean authenticate(String username, String password) {

		boolean isValidUserName = username.equalsIgnoreCase("debadyuti");
		boolean isValidPassword = password.equalsIgnoreCase("klvm");
		return isValidPassword && isValidUserName;
	}

}