package com.ispan.group3.service;

import java.util.List;

import com.ispan.group3.repository.CarOption;


public interface CarOptionService {

	List<CarOption> getCarOptions();
	
	CarOption getCarOption(Integer id);

	void insertCarOption(CarOption carOption);

	void updateCarOption(CarOption carOption);

	void deleteCarOption(Integer id);

}
