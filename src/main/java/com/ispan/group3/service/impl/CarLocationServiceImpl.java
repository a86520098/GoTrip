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
	public List<CarLocation> findAll() {
		return locationRepository.findAll();
	}

	@Override
	public CarLocation findById(Integer id) {
		return locationRepository.findById(id).get();
	}

	@Override
	public void save(CarLocation carLocation) {
		if (carLocation.getCountry() == null) {
			carLocation.setCountry("台灣");
		}
		if (carLocation.getCompanyId() == null) {
			carLocation.getCompanyId();
		}
		locationRepository.save(carLocation);
	}

	@Override
	public void deleteById(Integer id) {
		if (!locationRepository.existsById(id))
			throw new IllegalStateException("Car model with id " + id + " does not exist");
		locationRepository.deleteById(id);
	}

	@Override
	public List<CarLocation> findByCompany(Integer id) {
		return locationRepository.findByCompany(id);
	}
	
	
}