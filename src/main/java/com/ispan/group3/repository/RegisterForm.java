package com.ispan.group3.repository;

import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RegisterForm {
	
	@NotEmpty(message="username is required")
    private String username;
	
    @NotEmpty(message="Password is required")
    private String password;
    
//    private String authority;

}
