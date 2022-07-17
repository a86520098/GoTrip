package com.ispan.group3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
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
	public Object findAllGeos() {
		List<CarLocation> locations = locationService.findAll();
		
		JSONObject featureCollection = new JSONObject();
		
		featureCollection.put("type", "FeatureCollection");
		JSONArray features = new JSONArray();
		
		for (CarLocation location : locations) {
			JSONObject properties = new JSONObject();
			properties.put("name", location.getName());
			
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
//		JSONObject properties = new JSONObject();
//		properties.put("name", location.getName());
//		
//		JSONArray features = new JSONArray();
//		JSONObject feature = new JSONObject();
//		feature.put("type", "Feature");
//		JSONObject geometry = new JSONObject();
//
//		JSONArray JSONArrayCoord = new JSONArray();
//
//		JSONArrayCoord.add(0, location.getLongitude());
//		JSONArrayCoord.add(1, location.getLatitude());
//		geometry.put("type", "Point");
//		geometry.put("coordinates", JSONArrayCoord);
//		feature.put("geometry", geometry);
//		feature.put("properties", properties);
//
//		features.add(feature);
//		
//		
//		CarLocation location2 = locationService.findById(8);
//		
//		JSONObject properties2 = new JSONObject();
//		properties2.put("name", location2.getName());
//		
//		JSONArray features2 = new JSONArray();
//		JSONObject feature2 = new JSONObject();
//		feature2.put("type", "Feature");
//		JSONObject geometry2 = new JSONObject();
//
//		JSONArray JSONArrayCoord2 = new JSONArray();
//
//		JSONArrayCoord2.add(0, location2.getLongitude());
//		JSONArrayCoord2.add(1, location2.getLatitude());
//		geometry2.put("type", "Point");
//		geometry2.put("coordinates", JSONArrayCoord2);
//		feature2.put("geometry", geometry2);
//		feature2.put("properties", properties2);
//
//		features.add(feature2);
		
		
		featureCollection.put("features", features);

		return(featureCollection);
		
		
		
		
		
		
//		List<CarLocation> locations = locationService.findAll();
//		int listLength = locations.size();
//		Map<String, double[]> coordinates = new HashMap<>();
////		String[] coordinatesValue = new String[2];
//		List<Map> coordinatess = new ArrayList<Map>();
//		for (CarLocation location : locations) {
//			double[] coordinatesValue = {location.getId(), -17.5};
////			coordinatesValue[0] = location.getName();
////			coordinatesValue[1] = location.getDistrict();
//			coordinates.put("coordinates", coordinatesValue);
//			coordinatess.add(coordinates);
//		}
//		Map<String, Object> geometry = new HashMap<>();
////		for (int i = 0; i < listLength; i++) {
////			
////			coordinates.put("coordinates", coordinates);
////			coordinatess.add(coordinates);
////		}
//		
//		Gson gson = new Gson();
//		String json = gson.toJson(coordinatess);
//		System.out.println(json);
//		return geometry;
	}
	
}
