package com.ispan.group3.repository;


import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
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

		return AuthorityUtils.createAuthorityList(userData.getAuthority());
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
		return true;
	}

	@Override
	public boolean isEnabled() {
		
		return userData.isEnabled();
	}
	
}
