package com.ispan.group3.repository;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.springframework.context.annotation.Role;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserDetailsData implements UserDetails{
	
	private static final long serialVersionUID = 1L;
	
	private UserData userData;
	
	public UserDetailsData(UserData userData) {
		super();
		this.userData = userData;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
//		String roles = userData.getAuthority();
//		
////		List<SimpleGrantedAuthority> authorities = new ArrayList<>();
////		
////		for (Role role : roles) {
////			authorities.add(new SimpleGrantedAuthority(role.getClass()));
////		}
		
		return null;
	}

	@Override
	public String getPassword() {
		return userData.getPassword();
	}

	@Override
	public String getUsername() {
		return userData.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return false;
	}

	@Override
	public boolean isEnabled() {
		return false;
	}
	
	

}
