//package com.ispan.group3.security;
//
//import java.util.ArrayList;
//import java.util.Collection;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import com.ispan.group3.repository.User;
//
//public class SecurityUser extends User implements UserDetails{
//	
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//	
//	public SecurityUser(User user) {
//		if(user != null) {
//			this.setUser_id(user.getUser_id());
//			this.setCh_name(user.getCh_name());
//			this.setEn_name(user.getEn_name());
//			this.setEmail(user.getEmail());
//			this.setPassword(user.getPassword());
//			this.setGender(user.getGender());
//			this.setBirthday(user.getBirthday());
//			this.setPhone(user.getPhone());
//			this.setCity(user.getCity());
//			this.setLocation(user.getLocation());
//			this.setAddress(user.getAddress());
//			this.setImage(user.getImage());
//			this.setStatus(user.getStatus());
//			
//		}
//	}
//
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		Collection<GrantedAuthority> authorities = new ArrayList<>();
//		String email = this.getEmail();
//		if(email != null) {
//			SimpleGrantedAuthority authority = new SimpleGrantedAuthority(email);
//			authorities.add(authority);
//		}
//		return authorities;
//	}
//
//	@Override
//	public String getUsername() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public boolean isAccountNonExpired() {
//		return true;
//	}
//
//	@Override
//	public boolean isAccountNonLocked() {
//		return true;
//	}
//
//	@Override
//	public boolean isCredentialsNonExpired() {
//		return true;
//	}
//
//	@Override
//	public boolean isEnabled() {
//		return true;
//	}
//
//}
