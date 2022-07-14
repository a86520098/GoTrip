package com.ispan.group3.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "car_option")
public class CarOption {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "location_id", updatable = false)
	private CarLocation carLocation;

	@ManyToOne
	@JoinColumn(name = "model_id", updatable = false)
	private CarModel carModel;
	
	private Integer price;
	private Float discount;
	@Transient
	private Integer priceSale;
	private Integer amount;
	
	public CarOption() {
		
	}
	
	public CarOption(Integer id, CarLocation carLocation, CarModel carModel, Integer price, Float discount,
			Integer priceSale, Integer amount) {
		this.id = id;
		this.carLocation = carLocation;
		this.carModel = carModel;
		this.price = price;
		this.discount = discount;
		this.priceSale = priceSale;
		this.amount = amount;
	}


	public CarOption(CarLocation carLocation, CarModel carModel, Integer price, Float discount, Integer priceSale,
			Integer amount) {
		this.carLocation = carLocation;
		this.carModel = carModel;
		this.price = price;
		this.discount = discount;
		this.priceSale = priceSale;
		this.amount = amount;
	}
	

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public CarLocation getCarLocation() {
		return carLocation;
	}
	public void setCarLocation(CarLocation carLocation) {
		this.carLocation = carLocation;
	}
	
	public CarModel getCarModel() {
		return carModel;
	}
	
	public void setCarModel(CarModel carModel) {
		this.carModel = carModel;
	}
	
	public Integer getPrice() {
		return price;
	}
	
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	public Float getDiscount() {
		return discount;
	}
	public void setDiscount(Float discount) {
		this.discount = discount;
	}
	public Integer getPriceSale() {
		return (int) (price * discount);
	}
	public void setPriceSale(Integer priceSale) {
		this.priceSale = priceSale;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	
}
