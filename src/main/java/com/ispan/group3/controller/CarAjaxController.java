package com.ispan.group3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ispan.group3.repository.CarLocation;
import com.ispan.group3.repository.CarModel;
import com.ispan.group3.repository.CarOption;
import com.ispan.group3.service.CarLocationService;
import com.ispan.group3.service.CarModelService;
import com.ispan.group3.service.CarOptionService;

@RestController
@RequestMapping(path = "/api")
public class CarAjaxController {

	private final CarModelService modelService;
	private final CarLocationService locationService;
	private final CarOptionService optionService;

	@Autowired
	public CarAjaxController(CarModelService modelService, CarLocationService locationService, CarOptionService optionService) {
		this.modelService = modelService;
		this.locationService = locationService;
		this.optionService = optionService;
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

	@PostMapping("/cars/options")
	public Boolean saveModel(@RequestParam Integer locationId, @RequestParam Integer modelId, 
							 @RequestParam Integer amount, @RequestParam Integer price, @RequestParam Float discount) {
		CarOption carOption = new CarOption();
		carOption.setCarLocation(locationService.findById(locationId));
		carOption.setCarModel(modelService.findById(modelId));
		carOption.setAmount(amount);
		carOption.setPrice(price);
		carOption.setDiscount(discount);
		optionService.save(carOption);
		return true;
	}
	
	@GetMapping("/cars/locations/geojson")
	public Object findAllGeos() {
		List<CarLocation> locations = locationService.findAll();
		
		JSONObject featureCollection = new JSONObject();
		
		featureCollection.put("type", "FeatureCollection");
		JSONArray features = new JSONArray();
		
		for (CarLocation location : locations) {
			JSONObject properties = new JSONObject();
			properties.put("name", location.getName());
			properties.put("id", location.getId());
			
			JSONObject feature = new JSONObject();
			feature.put("type", "Feature");
			JSONObject geometry = new JSONObject();

			JSONArray JSONArrayCoord = new JSONArray();

			JSONArrayCoord.add(0, location.getLongitude());
			JSONArrayCoord.add(1, location.getLatitude());
			geometry.put("type", "Point");
			geometry.put("coordinates", JSONArrayCoord);
			feature.put("geometry", geometry);
			feature.put("properties", properties);

			features.add(feature);
		}		
		
		featureCollection.put("features", features);

		return(featureCollection);

	}
	
}