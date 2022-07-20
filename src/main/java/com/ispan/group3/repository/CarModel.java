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
	@Column(updatable = false)
	private String type;
	@Column(updatable = false)
	private String makeCh;
	@Column(updatable = false)
	private String makeEn;
	@Column(updatable = false)
	private String model;
	@Column(updatable = false)
	private String power;
	private String transmission;
	private Integer engine;
	private Integer seat;
	private Integer door;
	private Integer suitcase;
	private Integer bag;
	private String image;
	
	@OneToMany(mappedBy = "carModel")
	@JsonIgnore
	private List<CarOption> carOptions;


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
	public List<CarOption> getCarOptions() {
		return carOptions;
	}
	public void setCarOptions(List<CarOption> carOptions) {
		this.carOptions = carOptions;
	}
	

}