package com.ispan.group3.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
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
	public List<CarModel> findAll() {
		return modelService.findAll();
	}
	
	@GetMapping("/cars/models/{id}")
	public CarModel findById(@PathVariable Integer id) {
		return modelService.findById(id);
	}
	
	@GetMapping("/cars/locations")
	public List<CarLocation> findAllLocations() {
		return locationService.findAll();
	}
	
	@GetMapping("/cars/locations/geojson")
	public Map findAllGeos() {
		List<CarLocation> locations = locationService.findAll();
		int listLength = locations.size();
		Map<String, double[]> coordinates = new HashMap<>();
//		String[] coordinatesValue = new String[2];
		List<Map> coordinatess = new ArrayList<Map>();
		for (CarLocation location : locations) {
			double[] coordinatesValue = {location.getId(), -17.5};
//			coordinatesValue[0] = location.getName();
//			coordinatesValue[1] = location.getDistrict();
			coordinates.put("coordinates", coordinatesValue);
			coordinatess.add(coordinates);
		}
		Map<String, Object> geometry = new HashMap<>();
//		for (int i = 0; i < listLength; i++) {
//			
//			coordinates.put("coordinates", coordinates);
//			coordinatess.add(coordinates);
//		}
		
		Gson gson = new Gson();
		String json = gson.toJson(coordinatess);
		System.out.println(json);
		return geometry;
	}
	
}
