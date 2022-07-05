package com.ispan.group3.service;

import java.util.List;

import com.ispan.group3.repository.CarLocation;

public interface CarLocationService {

	List<CarLocation> getCarLocations();
	
	CarLocation getCarLocation(Integer id);

	void insertCarLocation(CarLocation carLocation);

	void updateCarLocation(CarLocation carLocation);

	void deleteCarLocation(Integer id);
}
