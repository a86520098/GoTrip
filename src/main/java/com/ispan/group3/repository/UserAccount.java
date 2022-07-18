package com.ispan.group3.repository;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserAccount {

	private int user_id;
	private String email;
	private String password;
	private String salt;

}
