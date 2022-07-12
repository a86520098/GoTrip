package com.ispan.group3.service;

import java.util.Optional;

import com.ispan.group3.repository.UserAccount;
import com.ispan.group3.repository.UserAccountVO;



public interface UserAccountService {

	// 業務邏輯
	public UserAccountVO login(UserAccount userAccount);
	public Optional<String> register(UserAccountVO userAccountVO);
	
	// 資料庫操作
	public UserAccount findMemberAccountByEmail(String email);

}
