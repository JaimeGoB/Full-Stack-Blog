package com.hoaxify.hoaxify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
/*
 * exclude = SecurityAutoConfiguration.class
 * Will disable spring security configuration
 * because we will need to authentic API requests.
 * */
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class BackendHoaxifyApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendHoaxifyApplication.class, args);
	}

}
