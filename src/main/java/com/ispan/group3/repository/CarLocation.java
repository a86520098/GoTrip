package com.ispan.group3.repository;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "car_location")
public class CarLocation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(updatable = false)
	private Integer companyId;
	private String name;
	private String country;
	private String county;
	private String district;
	private String address;
	private String phone;
	private String openTime;
	private String closeTime;

	@ManyToMany
	@JoinTable(name = "car_option",
			   joinColumns = @JoinColumn(name = "location_id"),
			   inverseJoinColumns = @JoinColumn(name = "model_id"))
	@JsonIgnore
	private List<CarModel> carModels;
	
	@OneToMany(mappedBy = "carLocation", fetch = FetchType.LAZY)
	private List<CarOption> carOptions;
	
	public CarLocation() {
		
	}

	
	public CarLocation(Integer id, Integer companyId, String name, String country, String county, String district,
			String address, String phone, String openTime, String closeTime, List<CarModel> carModels,
			List<CarOption> carOptions) {
		this.id = id;
		this.companyId = companyId;
		this.name = name;
		this.country = country;
		this.county = county;
		this.district = district;
		this.address = address;
		this.phone = phone;
		this.openTime = openTime;
		this.closeTime = closeTime;
		this.carModels = carModels;
		this.carOptions = carOptions;
	}


	public CarLocation(Integer companyId, String name, String country, String county, String district, String address,
			String phone, String openTime, String closeTime, List<CarModel> carModels, List<CarOption> carOptions) {
		this.companyId = companyId;
		this.name = name;
		this.country = country;
		this.county = county;
		this.district = district;
		this.address = address;
		this.phone = phone;
		this.openTime = openTime;
		this.closeTime = closeTime;
		this.carModels = carModels;
		this.carOptions = carOptions;
	}
	
	public CarLocation(Integer companyId, String name, String country, String county, String district, String address,
			String phone, String openTime, String closeTime) {
		this.companyId = companyId;
		this.name = name;
		this.country = country;
		this.county = county;
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
	
	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
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

	public List<CarModel> getCarModels() {
		return carModels;
	}

	public void setCarModels(List<CarModel> carModels) {
		this.carModels = carModels;
	}

	public List<CarOption> getCarOptions() {
		return carOptions;
	}

	public void setCarOptions(List<CarOption> carOptions) {
		this.carOptions = carOptions;
	}
	
	
		
	
}
