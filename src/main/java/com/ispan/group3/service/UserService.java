package com.ispan.group3.service;

import java.util.List;

import com.ispan.group3.repository.User;


public interface UserService {

//	boolean isDup(String id);

	List<User> getAllUsers();

	void saveOrUpdate(User user);

	User getUser(int user_id);
	
	User getByEmail(String email);

	void deleteUser(int user_id);

//	int updateMember(Member mb);

}