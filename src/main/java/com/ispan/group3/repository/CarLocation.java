package com.ispan.group3.repository;

import java.time.LocalTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "car_location")
public class CarLocation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "company_id")
	private Integer companyId;

	private String country;
	private String city;
	private String district;
	private String address;
	private String phone;
	private LocalTime openTime;
	private LocalTime closeTime;
	@JsonIgnore
	@OneToMany(mappedBy="carLocation")
	private Set<CarOption> carOptions;
	
	public CarLocation() {
		
	}

	public CarLocation(Integer id, String country, String city, String district, String address, String phone,
			LocalTime openTime, LocalTime closeTime, Set<CarOption> carOptions) {
		super();
		this.id = id;
		this.country = country;
		this.city = city;
		this.district = district;
		this.address = address;
		this.phone = phone;
		this.openTime = openTime;
		this.closeTime = closeTime;
		this.carOptions = carOptions;
	}

	public CarLocation(String country, String city, String district, String address, String phone, LocalTime openTime,
			LocalTime closeTime) {
		this.country = country;
		this.city = city;
		this.district = district;
		this.address = address;
		this.phone = phone;
		this.openTime = openTime;
		this.closeTime = closeTime;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public LocalTime getOpenTime() {
		return openTime;
	}

	public void setOpenTime(LocalTime openTime) {
		this.openTime = openTime;
	}

	public LocalTime getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(LocalTime closeTime) {
		this.closeTime = closeTime;
	}

	public Set<CarOption> getCarOptions() {
		return carOptions;
	}

	public void setCarOptions(Set<CarOption> carOptions) {
		this.carOptions = carOptions;
	} 
	
	
	
	
}
