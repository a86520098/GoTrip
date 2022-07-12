package com.ispan.group3.repository;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "car_model")
public class CarModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String type;
	private String makeCh;
	private String makeEn;
	private String model;
	private String power;
	private String transmission;
	private Integer displacement;
	private Integer seat;
	private Integer door;
	private Integer suitcase;
	private Integer bag;
	private String image;
	@ManyToMany(mappedBy="carModels")
	private Set<CarLocation> carLocations;
	
	@OneToMany(mappedBy = "carModel")
	private Set<CarOption> carOptions;
	
	public CarModel() {
		
	}

	public CarModel(Integer id, String type, String makeCh, String makeEn, String model, String power,
			String transmission, Integer displacement, Integer seat, Integer door, Integer suitcase, Integer bag,
			String image, Set<CarLocation> carLocations, Set<CarOption> carOptions) {
		this.id = id;
		this.type = type;
		this.makeCh = makeCh;
		this.makeEn = makeEn;
		this.model = model;
		this.power = power;
		this.transmission = transmission;
		this.displacement = displacement;
		this.seat = seat;
		this.door = door;
		this.suitcase = suitcase;
		this.bag = bag;
		this.image = image;
		this.carLocations = carLocations;
		this.carOptions = carOptions;
	}
	
	public CarModel(String type, String makeCh, String makeEn, String model, String power, String transmission,
			Integer displacement, Integer seat, Integer door, Integer suitcase, Integer bag, String image,
			Set<CarLocation> carLocations, Set<CarOption> carOptions) {
		this.type = type;
		this.makeCh = makeCh;
		this.makeEn = makeEn;
		this.model = model;
		this.power = power;
		this.transmission = transmission;
		this.displacement = displacement;
		this.seat = seat;
		this.door = door;
		this.suitcase = suitcase;
		this.bag = bag;
		this.image = image;
		this.carLocations = carLocations;
		this.carOptions = carOptions;
	}



	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMakeCh() {
		return makeCh;
	}
	public void setMakeCh(String makeCh) {
		this.makeCh = makeCh;
	}
	public String getMakeEn() {
		return makeEn;
	}
	public void setMakeEn(String makeEn) {
		this.makeEn = makeEn;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public String getTransmission() {
		return transmission;
	}
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
	public Integer getDisplacement() {
		return displacement;
	}
	public void setDisplacement(Integer displacement) {
		this.displacement = displacement;
	}
	public Integer getSeat() {
		return seat;
	}
	public void setSeat(Integer seat) {
		this.seat = seat;
	}
	public Integer getDoor() {
		return door;
	}
	public void setDoor(Integer door) {
		this.door = door;
	}
	public Integer getSuitcase() {
		return suitcase;
	}
	public void setSuitcase(Integer suitcase) {
		this.suitcase = suitcase;
	}
	public Integer getBag() {
		return bag;
	}
	public void setBag(Integer bag) {
		this.bag = bag;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Set<CarLocation> getCarLocations() {
		return carLocations;
	}
	public void setCarLocations(Set<CarLocation> carLocations) {
		this.carLocations = carLocations;
	}
	public Set<CarOption> getCarOptions() {
		return carOptions;
	}
	public void setCarOptions(Set<CarOption> carOptions) {
		this.carOptions = carOptions;
	}
	

}
