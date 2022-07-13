package com.ispan.group3.repository;


public interface UserAccountDao {

	public Integer insert(UserAccount memberAccount);
	public UserAccount findMemberAccountByEmail(String email);
	public Integer update(UserAccount memberAccount);

}
