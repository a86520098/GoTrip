package com.ispan.group3.repository;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;


import lombok.Data;

@Entity
@Data
@Table(name = "car_option")
public class CarOption {

	@EmbeddedId
	private CarOptionKey id;

	private Integer price;
	private Float discount;
	@Transient
	private Integer priceSale;
	private Integer amount;
	
	public CarOption() {
		
	}

	public CarOption(CarModel carModel, Integer price, Float discount,
			Integer priceSale, Integer amount) {
		this.id = id;
		this.price = price;
		this.discount = discount;
		this.priceSale = priceSale;
		this.amount = amount;
	}

	public CarOption(Integer price, Float discount, Integer priceSale,
			Integer amount) {
		this.price = price;
		this.discount = discount;
		this.priceSale = priceSale;
		this.amount = amount;
	}

	public CarOptionKey getId() {
		return id;
	}

	public void setId(CarOptionKey id) {
		this.id = id;
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

//	public void setPriceSale(Integer priceSale) {
//		this.priceSale = priceSale;
//	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	
	
}
