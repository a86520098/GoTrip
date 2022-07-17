package com.ispan.group3.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ispan.group3.repository.CarOption;
import com.ispan.group3.repository.CarOptionRepository;
import com.ispan.group3.service.CarOptionService;

//@Transactional
@Service
public class CarOptionServiceImpl implements CarOptionService{

	private CarOptionRepository optionRepository;
	
	@Autowired
	public CarOptionServiceImpl(CarOptionRepository optionRepository) {
		this.optionRepository = optionRepository;
	}

	@Override
	public List<CarOption> findAll() {
		return optionRepository.findAll();
	}

	@Override
	public CarOption findById(Integer id) {
		return optionRepository.findById(id).get();
	}

	@Override
	public void save(CarOption carOption) {
		optionRepository.save(carOption);
	}

//	@Override
//	public void updateCarOption(CarOption carOption) {
//		optionRepository.save(carOption);
//	}

	@Override
	public void deleteById(Integer id) {
		boolean exists = optionRepository.existsById(id);
		if (!exists) {
			throw new IllegalStateException("Car option with id " + id + " does not exist");
		}
		optionRepository.deleteById(id);
	}
	
	@Override
	public void deleteAllInBatch(List<CarOption> carOptions) {
		optionRepository.deleteAllInBatch(carOptions);
	}
	
	@Override
	public Long count() {
		return optionRepository.count();
	}

	
	
}
