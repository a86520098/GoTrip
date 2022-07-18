package com.ispan.group3.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ispan.group3.repository.UserData;

public interface UserService {

//	boolean isDup(String id);

	List<UserData> getAllUsers();

	void saveOrUpdate(UserData user);

	UserData getUser(int user_id);
	
	UserData findByUsername(String username);

	void deleteUser(int user_id);

//	int updateMember(Member mb);

}