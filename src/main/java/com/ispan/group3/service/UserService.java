package com.ispan.group3.service;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.mail.MessagingException;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.ispan.group3.repository.UserData;

public interface UserService {

//	boolean isDup(String id);

	List<UserData> getAllUsers();

	void saveOrUpdate(UserData user);

	UserData getUser(int user_id);
	
	UserData findByUsername(String username);

	void deleteUser(int user_id);

	void register(UserData user, String siteURL) throws UnsupportedEncodingException, MessagingException;

//	void register(UserData user);

	boolean verify(String code);

//	int updateMember(Member mb);

}