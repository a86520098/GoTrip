package com.ispan.group3.repository;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
//自定義配置
//@Component給身份讓spring boot實別
//@ConfigurationProperties(prefix = "book")直接注入不用@Value
//@Component
//@ConfigurationProperties(prefix = "book")

//@Entity持久化映射到database,聲明book實體可以進行ORM映射
//自動生成表
@Entity
@Table(name="Ticket")
public class ticketBean {
	@Id
	//自動生成
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ticketNo")
	private long ticketNo;
	
	@Column(name = "ticketName")
	private String ticketName;
	
	@Column(name = "ticketIntro")
	private String ticketIntro;
	
	@Column(name = "ticketOpenWeek")
	private String ticketOpenWeek;
	
	@Column(name = "ticketOpenTime")
	private String ticketOpenTime;
	
	@Column(name = "ticketEndTime")
	private String ticketEndTime;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "location")
	private String location;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "price")
	private int price;
	
	public long getTicketNo() {
		return ticketNo;
	}

	public ticketBean() {
		super();
	}
	public void setTicketNo(long ticketNo) {
		this.ticketNo = ticketNo;
	}

	public String getTicketName() {
		return ticketName;
	}

	public void setTicketName(String ticketName) {
		this.ticketName = ticketName;
	}

	public String getTicketIntro() {
		return ticketIntro;
	}

	public void setTicketIntro(String ticketIntro) {
		this.ticketIntro = ticketIntro;
	}

	public String getTicketOpenWeek() {
		return ticketOpenWeek;
	}

	public void setTicketOpenWeek(String ticketOpenWeek) {
		this.ticketOpenWeek = ticketOpenWeek;
	}

	public String getTicketOpenTime() {
		return ticketOpenTime;
	}

	public void setTicketOpenTime(String ticketOpenTime) {
		this.ticketOpenTime = ticketOpenTime;
	}

	public String getTicketEndTime() {
		return ticketEndTime;
	}

	public void setTicketEndTime(String ticketEndTime) {
		this.ticketEndTime = ticketEndTime;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public ticketBean(String ticketName, String ticketIntro, String ticketOpenWeek, String ticketOpenTime,
			String ticketEndTime, String phone, String country, String city, String location, String address,
			int price) {
		super();
		this.ticketName = ticketName;
		this.ticketIntro = ticketIntro;
		this.ticketOpenWeek = ticketOpenWeek;
		this.ticketOpenTime = ticketOpenTime;
		this.ticketEndTime = ticketEndTime;
		this.phone = phone;
		this.country = country;
		this.city = city;
		this.location = location;
		this.address = address;
		this.price = price;
	}

	public ticketBean(int ticketNo, String ticketName, String ticketIntro, String ticketOpenWeek, String ticketOpenTime,
			String ticketEndTime, String phone, String country, String city, String location, String address,
			int price) {
		super();
		this.ticketNo = ticketNo;
		this.ticketName = ticketName;
		this.ticketIntro = ticketIntro;
		this.ticketOpenWeek = ticketOpenWeek;
		this.ticketOpenTime = ticketOpenTime;
		this.ticketEndTime = ticketEndTime;
		this.phone = phone;
		this.country = country;
		this.city = city;
		this.location = location;
		this.address = address;
		this.price = price;
	}

}


