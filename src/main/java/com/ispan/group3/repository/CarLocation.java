package com.ispan.group3.repository;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "car_location")
public class CarLocation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "company_id", updatable = false)
	private CarCompany carCompany;
	private String name;
	private String country;
	private String county;
	private String district;
	private String address;
	private String phone;
	private String openTime;
	private String closeTime;
	private String longitude;
	private String latitude;

	
	@OneToMany(mappedBy = "carLocation", fetch = FetchType.LAZY)
	private List<CarOption> carOptions;
	
	public CarLocation() {
		
	}
	
	public CarLocation(Integer id, CarCompany carCompany, String name, String country, String county, String district,
			String address, String phone, String openTime, String closeTime,String longitude, String latitude, List<CarOption> carOptions) {
		this.id = id;
		this.carCompany = carCompany;
		this.name = name;
		this.country = country;
		this.county = county;
		this.district = district;
		this.address = address;
		this.phone = phone;
		this.openTime = openTime;
		this.closeTime = closeTime;
		this.longitude = longitude;
		this.latitude = latitude;
		this.carOptions = carOptions;
	}


	public CarLocation(CarCompany carCompany, String name, String country, String county, String district, String address,
			String phone, String openTime, String closeTime, String longitude, String latitude, List<CarOption> carOptions) {
		this.carCompany = carCompany;
		this.name = name;
		this.country = country;
		this.county = county;
		this.district = district;
		this.address = address;
		this.phone = phone;
		this.openTime = openTime;
		this.closeTime = closeTime;
		this.carOptions = carOptions;
	}
	
	public CarLocation(CarCompany carCompany, String name, String country, String county, String district, String address,
			String phone, String openTime, String closeTime, String longitude, String latitude) {
		this.carCompany = carCompany;
		this.name = name;
		this.country = country;
		this.county = county;
		this.district = district;
		this.address = address;
		this.phone = phone;
		this.openTime = openTime;
		this.closeTime = closeTime;
		this.longitude = longitude;
		this.latitude = latitude;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public CarCompany getCarCompany() {
		return carCompany;
	}

	public void setCarCompany(CarCompany carCompany) {
		this.carCompany = carCompany;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
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

	public String getOpenTime() {
		return openTime;
	}

	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}

	public String getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}
	

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public List<CarOption> getCarOptions() {
		return carOptions;
	}

	public void setCarOptions(List<CarOption> carOptions) {
		this.carOptions = carOptions;
	}
	
	
		
	
}
