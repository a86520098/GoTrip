package com.ispan.group3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ispan.group3.repository.CarLocation;
import com.ispan.group3.repository.CarModel;
import com.ispan.group3.service.CarLocationService;
import com.ispan.group3.service.CarModelService;

@RestController
@RequestMapping(path = "/api")
public class CarAjaxController {

	private final CarModelService modelService;
	private final CarLocationService locationService;

	@Autowired
	public CarAjaxController(CarModelService modelService, CarLocationService locationService) {
		this.modelService = modelService;
		this.locationService = locationService;
	}
	
	@GetMapping({"/cars","/cars/models"})
	public List<CarModel> getCarModels() {
		return modelService.getCarModels();
	}
	
	@GetMapping("/cars/{id}")
	public CarModel getCarModel(@PathVariable Integer id) {
		return modelService.getCarModel(id);
	}
	
	@GetMapping("/cars/locations")
	public List<CarLocation> getCarLocations() {
		return locationService.getCarLocations();
	}
	
}
