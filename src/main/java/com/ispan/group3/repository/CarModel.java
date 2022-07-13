package com.ispan.group3.repository;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	private Integer engine;
	private Integer seat;
	private Integer door;
	private Integer suitcase;
	private Integer bag;
	private String image;
	@ManyToMany(mappedBy="carModels")
	@JsonIgnore
	private List<CarLocation> carLocations;
	
	@OneToMany(mappedBy = "carOptionKey.carModel")
	@JsonIgnore
	private List<CarOption> carOptions;
	
	public CarModel() {
		
	}

	public CarModel(Integer id, String type, String makeCh, String makeEn, String model, String power,
			String transmission, Integer engine, Integer seat, Integer door, Integer suitcase, Integer bag,
			String image, List<CarLocation> carLocations, List<CarOption> carOptions) {
		this.id = id;
		this.type = type;
		this.makeCh = makeCh;
		this.makeEn = makeEn;
		this.model = model;
		this.power = power;
		this.transmission = transmission;
		this.engine = engine;
		this.seat = seat;
		this.door = door;
		this.suitcase = suitcase;
		this.bag = bag;
		this.image = image;
		this.carLocations = carLocations;
		this.carOptions = carOptions;
	}
	
	public CarModel(String type, String makeCh, String makeEn, String model, String power, String transmission,
			Integer engine, Integer seat, Integer door, Integer suitcase, Integer bag, String image,
			List<CarLocation> carLocations, List<CarOption> carOptions) {
		this.type = type;
		this.makeCh = makeCh;
		this.makeEn = makeEn;
		this.model = model;
		this.power = power;
		this.transmission = transmission;
		this.engine = engine;
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
	public Integer getEngine() {
		return engine;
	}
	public void setEngine(Integer engine) {
		this.engine = engine;
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
	public List<CarLocation> getCarLocations() {
		return carLocations;
	}
//	public void setCarLocations(List<CarLocation> carLocations) {
//		this.carLocations = carLocations;
//	}
	public List<CarOption> getCarOptions() {
		return carOptions;
	}
//	public void setCarOptions(List<CarOption> carOptions) {
//		this.carOptions = carOptions;
//	}
	

}
