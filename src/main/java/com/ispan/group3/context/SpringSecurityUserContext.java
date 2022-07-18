//package com.ispan.group3.context;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContext;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.stereotype.Component;
//
//import com.ispan.group3.repository.UserData;
//import com.ispan.group3.repository.UserRepository;
//import com.ispan.group3.service.impl.UserDetailsServiceImpl;
//
//@Component
//public class SpringSecurityUserContext implements UserContext{
//
//	@Autowired
//	private UserRepository userRepository;
//	
//	@Autowired
//	private UserDetailsServiceImpl userDetailsServiceImpl;
//	
//	@Override
//	public UserData getCurrentUser() { //取得已登入使用者物件
//		SecurityContext context=SecurityContextHolder.getContext(); //從ContextHolder中取得SecurityContext物件
//		Authentication auth=context.getAuthentication(); //從SecurityContext物件取得Authentication物件
//		//檢查是否有使用者登入
//		if(auth== null){
//			return null;
//		}
//		//取得通過驗證的使用者名稱
//		String username=((UserData) auth).getUsername(); 
//		return userRepository.findByUsername(username); 
//	}
//	
//	@Override
//	public void setCurrentUser(UserData user) { //將使用者設定已登入
//		//透過Service取得UserDetails
//		UserDetails userDetails=userDetailsServiceImpl.loadUserByUsername(user.getUsername());
//		//將使用者放入Authentication物件，代表已通過驗證
//		Authentication auth=new UsernamePasswordAuthenticationToken(userDetails, 
//				user.getPassword(), userDetails.getAuthorities());
//		//將Authentication物件放入SecurityContext存放
//		SecurityContextHolder.getContext().setAuthentication(auth); 
//	}
//
//}
