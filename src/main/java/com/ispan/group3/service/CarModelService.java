package com.ispan.group3.service;

import java.util.List;

import com.ispan.group3.repository.CarModel;


public interface CarModelService {

	List<CarModel> getCarModels();
	
	CarModel getCarModel(Integer id);

	void insertCarModel(CarModel carModel);

	void updateCarModel(CarModel carModel);

	void deleteCarModel(Integer id);

}
