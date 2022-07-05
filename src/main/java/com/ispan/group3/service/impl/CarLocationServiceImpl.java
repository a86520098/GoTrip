package com.ispan.group3.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ispan.group3.repository.CarLocation;
import com.ispan.group3.repository.CarLocationRepository;
import com.ispan.group3.service.CarLocationService;

@Service
public class CarLocationServiceImpl implements CarLocationService{

	private CarLocationRepository locationRepository;
	
	@Autowired
	public CarLocationServiceImpl(CarLocationRepository locationRepository) {
		this.locationRepository = locationRepository;
	}

	@Override
	public List<CarLocation> getCarLocations() {
		return locationRepository.findAll();
	}

	@Override
	public CarLocation getCarLocation(Integer id) {
		return locationRepository.findById(id).get();
	}

	@Override
	public void insertCarLocation(CarLocation carLocation) {
		locationRepository.save(carLocation);
	}

	@Override
	public void updateCarLocation(CarLocation carLocation) {
		locationRepository.save(carLocation);
	}

	@Override
	public void deleteCarLocation(Integer id) {
		if (!locationRepository.existsById(id))
			throw new IllegalStateException("Car model with id " + id + " does not exist");
		locationRepository.deleteById(id);
	}

	
}
