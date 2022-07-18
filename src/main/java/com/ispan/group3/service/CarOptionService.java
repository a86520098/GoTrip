package com.ispan.group3.service;

import java.util.List;

import com.ispan.group3.repository.CarOption;


public interface CarOptionService {

	List<CarOption> findAll();
	
	CarOption findById(Integer id);

	void save(CarOption carOption);

//	void updateCarOption(CarOption carOption);

	void deleteById(Integer id);

	Long count();

}
