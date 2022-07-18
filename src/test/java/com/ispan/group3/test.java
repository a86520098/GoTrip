package com.ispan.group3;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class test {

	public static void main(String[] args) {
		
		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encode = passwordEncoder.encode("Admin1234");
		System.out.println(encode);

		String encode2 = passwordEncoder.encode("Aaaa1234");
		System.out.println(encode2);
	}

}
