package com.ispan.group3.repository;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	@Column(name = "make_ch")
	private String makeCh;
	@Column(name = "make_en")
	private String makeEn;
	private String model;
	private String power;
	private String transmission;
	private Integer displacement;
	private Integer price;
	private Integer seat;
	private Integer door;
	private Integer suitcase;
	private Integer bag;
	private String image;
	@JsonIgnore
	@OneToMany(mappedBy="carModel")
	private List<CarOption> carOptions;
	
	
	public CarModel() {
	}
	
	public CarModel(Integer id, String type, String makeCh, String makeEn, String model, String power, String transmission,
			Integer displacement, Integer price, Integer seat, Integer door, Integer suitcase, Integer bag, String image,
			List<CarOption> carOptions) {
		this.id = id;
		this.type = type;
		this.makeCh = makeCh;
		this.makeEn = makeEn;
		this.model = model;
		this.power = power;
		this.transmission = transmission;
		this.displacement = displacement;
		this.price = price;
		this.seat = seat;
		this.door = door;
		this.suitcase = suitcase;
		this.bag = bag;
		this.image = image;
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
	public List<CarOption> getCarOptions() {
		return carOptions;
	}
	public void setCarOptions(List<CarOption> carOptions) {
		this.carOptions = carOptions;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
	

}
