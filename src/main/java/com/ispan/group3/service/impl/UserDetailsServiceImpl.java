package com.ispan.group3.service.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ispan.group3.repository.UserData;
import com.ispan.group3.repository.UserRepository;
import com.ispan.group3.service.UserService;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private UserService userService;

	
	public static class UserAuthorityUtils {
		
		//Dealer只能看到前台+商家管理
		private static final List<GrantedAuthority> EVERYONE_ROLES = AuthorityUtils
				.createAuthorityList("ROLE_ADMIN","ROLE_DEALER","ROLE_USER");
		
		//Admin可以看到所有內容
		private static final List<GrantedAuthority> ADMIN_ROLES = AuthorityUtils
				.createAuthorityList("ROLE_ADMIN");
				//利用Spring提供的AuthorityUtils中createAuthorityList將該群組加入相關rolesS
				//以便用一個List變數就儲存所有roles

		//Dealer只能看到前台+商家管理
		private static final List<GrantedAuthority> DEALER_ROLES = AuthorityUtils
				.createAuthorityList("ROLE_DEALER");
		
		//User只能看到前台
		private static final List<GrantedAuthority> USER_ROLES = AuthorityUtils
				.createAuthorityList("ROLE_USER");
		
		public static Collection<? extends GrantedAuthority> createAuthorities(UserData user) {
			String authority= user.getAuthority();
			if (authority.contains("admin")) { //信箱中含有admin，即有管理者之role
				return ADMIN_ROLES;
			}else if (authority.contains("dealer")) { //信箱中含有dealer，即有商家的role
				return DEALER_ROLES;
			}else
			return USER_ROLES; //否則則為一般使用者
		}
		
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		//查詢用戶是否存在
		UserData user = userService.findByUsername(username);
		if(user==null){
			throw new UsernameNotFoundException("User Not Found !");
		}else {
			
		//用集合及一個helper class來取得user的擁有的role
		Collection<? extends GrantedAuthority> authorities = UserAuthorityUtils.createAuthorities(user);
		//UserAuthorityUtils是helper class
		return new User(user.getUsername(), user.getPassword(), authorities); 
		//這邊的User是指org.springframework.security.core.userdetails.User
		//是UserDetails介面的實作，儲存使用者名稱、密碼及擁有權限
		}
	}
	
	
}
