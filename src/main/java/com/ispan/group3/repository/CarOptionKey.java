package com.ispan.group3.repository;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CarOptionKey implements Serializable{

	@Column(name = "location_id")
	Integer locationId;
	
	@Column(name = "model_id")
	Integer modelId;

	public CarOptionKey() {
	}

	public CarOptionKey(Integer locationId, Integer modelId) {
		this.locationId = locationId;
		this.modelId = modelId;
	}
	
	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	public Integer getModelId() {
		return modelId;
	}

	public void setModelId(Integer modelId) {
		this.modelId = modelId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(locationId, modelId);
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
		return Objects.equals(locationId, other.locationId) && Objects.equals(modelId, other.modelId);
	}
	
	
}
