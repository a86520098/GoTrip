package com.ispan.group3.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@Entity
@Table(name="user_data")
public class UserData{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;
	private String username;
	private String ch_name;
	private String en_name;
	private String password;
	private String gender;
	private String birthday;
	private String phone;
	private String city;
	private String location;
	private String address;
	private String image;
	private String authority;
	private boolean enabled;
	@Column(name = "verification_code", length = 64)
    private String verificationCode;
	
	
	
	public UserData(int user_id, String username, String ch_name, String en_name, String password, String gender,
			String birthday2, String phone, String city, String location, String address) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.ch_name = ch_name;
		this.en_name = en_name;
		this.password = password;
		this.gender = gender;
		this.birthday = birthday2;
		this.phone = phone;
		this.city = city;
		this.location = location;
		this.address = address;
//		this.image = image;
	}
	
	public UserData(String username, String ch_name, String en_name, String password, String gender, String birthday,
			String phone, String city, String location, String address) {
		super();
		this.username = username;
		this.ch_name = ch_name;
		this.en_name = en_name;
		this.password = password;
		this.gender = gender;
		this.birthday = birthday;
		this.phone = phone;
		this.city = city;
		this.location = location;
		this.address = address;
	}

	public UserData() {
		// TODO Auto-generated constructor stub
	}

	public UserData(int user_id, String username, String ch_name, String en_name, String password, String gender,
			String birthday, String phone, String city, String location, String address, String image, String authority) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.ch_name = ch_name;
		this.en_name = en_name;
		this.password = password;
		this.gender = gender;
		this.birthday = birthday;
		this.phone = phone;
		this.city = city;
		this.location = location;
		this.address = address;
		this.image = image;
		this.authority = authority;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCh_name() {
		return ch_name;
	}

	public void setCh_name(String ch_name) {
		this.ch_name = ch_name;
	}

	public String getEn_name() {
		return en_name;
	}

	public void setEn_name(String en_name) {
		this.en_name = en_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getVerificationCode() {
		return verificationCode;
	}

	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
	}


	
	

}
