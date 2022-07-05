package com.ispan.group3.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ispan.group3.repository.CarModel;
import com.ispan.group3.repository.CarModelRepository;
import com.ispan.group3.service.CarModelService;

//@Transactional
@Service
public class CarModelServiceImpl implements CarModelService{

	private CarModelRepository carRepository;
	
	@Autowired
	public CarModelServiceImpl(CarModelRepository carRepository) {
		this.carRepository = carRepository;
	}

	@Override
	public List<CarModel> getCarModels() {
		return carRepository.findAll();
	}

	@Override
	public CarModel getCarModel(Integer id) {
		return carRepository.findById(id).get();
	}

	@Override
	public void insertCarModel(CarModel carModel) {
		carRepository.save(carModel);
	}

	@Override
	public void updateCarModel(CarModel carModel) {
		carRepository.save(carModel);
	}

	@Override
	public void deleteCarModel(Integer id) {
		if (!carRepository.existsById(id))
			throw new IllegalStateException("Car model with id " + id + " does not exist");
		carRepository.deleteById(id);
	}

	
	
}
