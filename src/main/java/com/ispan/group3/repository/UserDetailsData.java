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
	
	
	public void setUsername(String username) {
		this.userData.setUsername(username);
	}
	
	public void setCh_name(String ch_name) {
		this.userData.setCh_name(ch_name);
	}
	
	public void setEn_name(String en_name) {
		this.userData.setEn_name(en_name);
	}
	
	public void setPhone(String phone) {
		this.userData.setPhone(phone);
	}
	
	public void setBirthday(String birthday) {
		this.userData.setBirthday(birthday);
	}
	
	public void setGender(String gender) {
		this.userData.setGender(gender);
	}
	
	public void setCity(String city) {
		this.userData.setCity(city);
	}
	
	public void setLocation(String location) {
		this.userData.setLocation(location);
	}
	
	public void setAddress(String address) {
		this.userData.setAddress(address);
	}
	
	public void setDealer_id(String dealer_id) {
		this.userData.setDealer_name(dealer_id);
	}
	
	public void setTax_id(String tax_id) {
		this.userData.setTax_id(tax_id);
	}
	
	public void setAuthority(String authority) {
		this.userData.setAuthority(authority);
	}
	
	public boolean isEnabled(boolean b) {
		return userData.isEnabled();
	}
	
	public void setImage(String image) {
		this.userData.setImage(image);
	}


	
}
