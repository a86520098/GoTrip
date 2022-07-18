//package com.ispan.group3.service.impl;
//
//import java.util.Collections;
//import java.util.List;
//import java.util.Optional;
//import java.util.UUID;
//import java.util.stream.Collectors;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.util.DigestUtils;
//
//import com.ispan.group3.repository.User;
//import com.ispan.group3.repository.UserAccount;
//import com.ispan.group3.repository.UserAccountDao;
//import com.ispan.group3.repository.UserAccountVO;
//import com.ispan.group3.service.UserAccountService;
//import com.ispan.group3.service.UserService;
//import com.ispan.group3.util.ValidFormat;
//
//
//
//@Service
//public class UserAccountServiceImpl implements UserAccountService {
//
//	@Autowired
//	private UserAccountDao userAccountDao;
//
//	@Autowired
//	private UserService userService;
//	
//	@SuppressWarnings("unused")
//	private String getMd5Password(String password, String salt) {
//		// 對password + salt 進行三次加密
//		String str = password + salt;
//		for (int i = 0; i < 3; i++) {
//			str = DigestUtils.md5DigestAsHex(str.getBytes()).toUpperCase();
//		}
//		return str;
//	}
//	
//	@Override
//	public UserAccountVO login(UserAccount userAccount) {
//		// TODO Auto-generated method stub
//		// 檢查帳號是否存在
//		UserAccount data = userAccountDao.findMemberAccountByEmail(userAccount.getEmail());
//		if(data == null) return null;
//
//		// 使用資料庫鹽值對輸入密碼進行加密
//		String md5Password = getMd5Password(userAccount.getPassword(), data.getSalt());
//
//		// 比對密碼是否相等
//		if(!md5Password.equals(data.getPassword())) return null;
//		
//		// 取得對應User 資料
//		User user = userService.getUser(data.getUser_id());
//		if(user == null) return null;
//		
//		// 組合資料為MemberAccountVO
//		UserAccountVO memberAccountVO = new UserAccountVO();
//		memberAccountVO.setEmail(userAccount.getEmail());
//		memberAccountVO.setCh_name(user.getCh_name());  //??
//		return memberAccountVO;
//	}
//
//	@Override
//	public Optional<String> register(UserAccountVO userAccountVO) {
//		// TODO Auto-generated method stub
//		// 驗證欄位是否填寫及格式
//		if(!ValidFormat.isEmail(userAccountVO.getEmail())) return Optional.of("帳號必須是Email 格式");
//		if(!ValidFormat.isPassword(userAccountVO.getPassword())) return Optional.of("密碼必須為長度6~16位碼大小寫英文加數字");
////		if(!userAccountVO.getPassword().equals(userAccountVO.getCheckPassword())) return Optional.of("兩次輸入密碼不相符");
//		
//		// 檢查帳號是否重複註冊
//		UserAccount data = userAccountDao.findMemberAccountByEmail(userAccountVO.getEmail());
//		if(data != null) return Optional.of("該帳號已被使用");
//		
//		// 產生鹽值
//		String salt = UUID.randomUUID().toString().toUpperCase().replaceAll("-", "");
//		
//		// 密碼加密
//		String md5Password = getMd5Password(userAccountVO.getPassword(), salt);
//
//		// 新增MemberAccount 資料
//		UserAccount userAccount = new UserAccount();
//		userAccount.setEmail(userAccountVO.getEmail());
//		userAccount.setPassword(md5Password);
//		userAccount.setSalt(salt);
////		userAccount.setCreate_by(userAccountVO.getEmail());
////		userAccount.setUpdate_by(userAccountVO.getEmail());
//		Integer id = userAccountDao.insert(userAccount);
//		if(id == 0) return Optional.of("新增會員帳號時發生錯誤");
//
//		// 新增Member 資料
////		User user = new User();
////		user.setMa_id(String.valueOf(id));
////		user.setName(memberAccountVO.getName());
////		user.setCreate_by(memberAccountVO.getUsername());
////		user.setUpdate_by(memberAccountVO.getUsername());
////		Integer result = memberService.insert(member);
////		if(result == 0) return Optional.of("新增會員資料時發生錯誤");
//		
//		return Optional.empty();
//	}
//
//	@Override
//	public UserAccount findMemberAccountByEmail(String email) {
//		// TODO Auto-generated method stub
//		return userAccountDao.findMemberAccountByEmail(email);
//	}
//	
//	
//
//
//}
