package com.ispan.group3.repository;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Embeddable
public class CarOptionKey implements Serializable{


	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "location_id")
	@JsonIgnore
	private CarLocation carLocation;
	
	@ManyToOne
	@JoinColumn(name = "model_id")
	private CarModel carModel;	
	
//	@Column(name = "location_id")
//	Integer locationId;
//	
//	@Column(name = "model_id")
//	Integer modelId;

	public CarOptionKey() {
	}
	
	public CarOptionKey(CarLocation carLocation, CarModel carModel) {
		this.carLocation = carLocation;
		this.carModel = carModel;
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

	@Override
	public int hashCode() {
		return Objects.hash(carLocation, carModel);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarOptionKey other = (CarOptionKey) obj;
		return Objects.equals(carLocation, other.carLocation) && Objects.equals(carModel, other.carModel);
	}

	
	
	
	
}
