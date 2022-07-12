package com.ispan.group3.service;

import java.util.List;

import com.ispan.group3.repository.CarModel;


public interface CarModelService {

	List<CarModel> findAll();
	
	CarModel findById(Integer id);

	void save(CarModel carModel);

	void deleteById(Integer id);

}
