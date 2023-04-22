package com.springboot.webapp.productivityapp.security;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SpringSecurityConfigaration {
	//LDAP or database
	
//	InMemoryUserDetailsManager
//	inMemoryUserDetailsManager(UserDetails... users)
//	
	@Bean
	public InMemoryUserDetailsManager createUserDetailsManager() {
		
		
		String username = "Rohit";
		String password = "klvm";
		
		UserDetails userDetails = createNewUser(username, password);
		UserDetails userDetails1 = createNewUser("Deb", "java");
		
		return new InMemoryUserDetailsManager(userDetails,userDetails1);
	}

	private UserDetails createNewUser(String username, String password) {
		Function<String, String> passwordEncoder
		= input -> passwordEncoder().encode(input);
		
		UserDetails userDetails = User.builder()
				.passwordEncoder(passwordEncoder)
		.username(username)
		.password(password)
		.roles("USER","ADMIN")
		.build();
		return userDetails;
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
