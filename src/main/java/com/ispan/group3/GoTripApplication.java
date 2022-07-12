package com.ispan.group3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication //(exclude = {SecurityAutoConfiguration.class })
public class GoTripApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoTripApplication.class, args);
	}

}
