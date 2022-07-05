package com.ispan.group3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ispan.group3.repository.CarModel;
import com.ispan.group3.service.CarModelService;

@Controller
public class CarController {

	private final CarModelService modelService;


	@Autowired
	public CarController(CarModelService modelService) {
		this.modelService = modelService;
	}
	
	@GetMapping({"/backend/cars", "/backend/car/models"})
	public String getComments(Model model) {
		List<CarModel> carModels = modelService.getCarModels();
		model.addAttribute("carModels", carModels);
		return "backend/car-list";
	}
	
	
	
	
}
