package com.ispan.group3.repository;

import java.time.LocalTime;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "car_location")
public class CarLocation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer companyId;
	private String name;
	private String country;
	private String city;
	private String district;
	private String address;
	private String phone;
	private LocalTime openTime;
	private LocalTime closeTime;

	@ManyToMany
	@JoinTable(name = "car_option",
			   joinColumns = @JoinColumn(name = "location_id"),
			   inverseJoinColumns = @JoinColumn(name = "model_id"))
	private Set<CarModel> carModels;
	
	@OneToMany(mappedBy = "carLocation")
	private Set<CarOption> carOptions;
	
	public CarLocation() {
		
	}

	
	public CarLocation(Integer id, Integer companyId, String name, String country, String city, String district,
			String address, String phone, LocalTime openTime, LocalTime closeTime, Set<CarModel> carModels,
			Set<CarOption> carOptions) {
		this.id = id;
		this.companyId = companyId;
		this.name = name;
		this.country = country;
		this.city = city;
		this.district = district;
		this.address = address;
		this.phone = phone;
		this.openTime = openTime;
		this.closeTime = closeTime;
		this.carModels = carModels;
		this.carOptions = carOptions;
	}


	public CarLocation(Integer companyId, String name, String country, String city, String district, String address,
			String phone, LocalTime openTime, LocalTime closeTime, Set<CarModel> carModels, Set<CarOption> carOptions) {
		this.companyId = companyId;
		this.name = name;
		this.country = country;
		this.city = city;
		this.district = district;
		this.address = address;
		this.phone = phone;
		this.openTime = openTime;
		this.closeTime = closeTime;
		this.carModels = carModels;
		this.carOptions = carOptions;
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

	public Set<CarModel> getCarModels() {
		return carModels;
	}

	public void setCarModels(Set<CarModel> carModels) {
		this.carModels = carModels;
	}

	public Set<CarOption> getCarOptions() {
		return carOptions;
	}

	public void setCarOptions(Set<CarOption> carOptions) {
		this.carOptions = carOptions;
	}
	
	
		
	
}
