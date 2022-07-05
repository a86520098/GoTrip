package com.ispan.group3.service;

import java.util.List;

import com.ispan.group3.repository.Member;


public interface MemberService {

//	boolean isDup(String id);

	List<Member> getAllMembers();

	void saveOrUpdate(Member mb);

	Member getMember(int user_id);
	
	Member getByEmail(String email);

	void deleteMember(int user_id);

//	int updateMember(Member mb);

}