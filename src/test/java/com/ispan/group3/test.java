package com.ispan.group3;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class test {

	public static void main(String[] args) {
		
		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encode = passwordEncoder.encode("admin");
		System.out.println(encode);

		String encode2 = passwordEncoder.encode("dealer");
		System.out.println(encode2);
		
		String encode3 = passwordEncoder.encode("user");
		System.out.println(encode3);

		String encode4 = passwordEncoder.encode("eeit454");
		System.out.println(encode4);
	
	
	
	
	
}

}