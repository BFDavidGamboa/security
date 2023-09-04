package com.david.security;

import com.david.security.user.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecurityjavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityjavaApplication.class, args);
	}
	User user = new User();
}
