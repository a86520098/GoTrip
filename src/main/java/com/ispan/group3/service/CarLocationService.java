package com.ispan.group3.service;

import java.util.List;

import com.ispan.group3.repository.CarLocation;

public interface CarLocationService {

	List<CarLocation> findAll();
	
	CarLocation findById(Integer id);

	void save(CarLocation carLocation);

//	void updateCarLocation(CarLocation carLocation);

	void deleteById(Integer id);

	List<CarLocation> findByCompany(Integer id);
}
