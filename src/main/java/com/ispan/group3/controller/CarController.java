package com.ispan.group3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ispan.group3.repository.CarModel;
import com.ispan.group3.repository.Comment;
import com.ispan.group3.service.CarModelService;

@Controller
public class CarController {

	private final CarModelService modelService;


	@Autowired
	public CarController(CarModelService modelService) {
		this.modelService = modelService;
	}
	
	@GetMapping({"/backend/cars", "/backend/cars/models"})
	public String getCarList(Model model) {
		List<CarModel> carModels = modelService.getCarModels();
		model.addAttribute("carModels", carModels);
		return "backend/car-list";
	}
	
	@GetMapping({"/backend/cars/form", "/backend/cars/form/{id}"})
	public String showCarForm(Model model, @PathVariable(required = false) Integer id) {
		CarModel carModel;
		if (id != null) {
			carModel = modelService.getCarModel(id);
		} else {
			carModel = new CarModel();			
		}
		model.addAttribute("carModel", carModel);
		return "backend/car-form";
	}
	
	@GetMapping("/cars")
	public String getCars(Model model) {
		List<CarModel> carModels = modelService.getCarModels();
		model.addAttribute("carModels", carModels);
		return "frontend/car";
	}
	
	
	
	
}
