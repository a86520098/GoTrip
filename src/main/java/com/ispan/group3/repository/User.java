package com.ispan.group3.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_data")
public class User{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;
	private String email;
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
	private String status;
	
	
	
	public User(int user_id, String email, String ch_name, String en_name, String password, String gender,
			String birthday2, String phone, String city, String location, String address) {
		super();
		this.user_id = user_id;
		this.email = email;
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
	
	public User(String email, String ch_name, String en_name, String password, String gender, String birthday,
			String phone, String city, String location, String address) {
		super();
		this.email = email;
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

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(int user_id, String email, String ch_name, String en_name, String password, String gender,
			String birthday, String phone, String city, String location, String address, String image, String status) {
		super();
		this.user_id = user_id;
		this.email = email;
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
		this.status = status;
	}

	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_no) {
		this.user_id = user_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


//	@Override
//	public String toString() {
//		return "Member [id=" + user_id + 
//				", itemTb=" + itemTb + 
//				", itemId=" + itemId + 
//				", userId=" + userId + 
//				", date=" + date + 
//				", rating=" + rating + 
//				", content=" + content + 
//				", image1=" + image1 + 
//				", image2=" + image2 + 
//				", image3=" + image3 + "]";
//	}
	
	

}
