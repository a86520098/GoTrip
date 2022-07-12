package com.ispan.group3.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.ispan.group3.repository.CarLocation;
import com.ispan.group3.repository.CarModel;
import com.ispan.group3.service.CarLocationService;
import com.ispan.group3.service.CarModelService;
import com.ispan.group3.util.FileUploadUtil;

@Controller
public class CarController {

	private final CarModelService modelService;
	private final CarLocationService locationService;


	@Autowired
	public CarController(CarModelService modelService, CarLocationService locationService) {
		this.modelService = modelService;
		this.locationService = locationService;
	}

	
	@GetMapping({"/backend/cars", "/backend/cars/models"})
	public String getCarList(Model model) {
		List<CarModel> carModels = modelService.findAll();
		model.addAttribute("carModels", carModels);
		return "backend/car-list";
	}

	@GetMapping({"/backend/cars/form"})
	public String showNewCarForm(Model model) {
		CarModel carModel= new CarModel();			
		model.addAttribute("carModel", carModel);
		return "backend/car-new-form";
	}
	
	@GetMapping({"/backend/cars/form/{id}"})
	public String showCarForm(Model model, @PathVariable(required = false) Integer id) {
		CarModel carModel;
		if (id != null) {
			carModel = modelService.findById(id);
		} else {
			carModel = new CarModel();			
		}
		model.addAttribute("carModel", carModel);
		return "backend/car-form";
	}
	
	@GetMapping("/cars")
	public String getCars(Model model) {
		List<CarModel> carModels = modelService.findAll();
		model.addAttribute("carModels", carModels);
		return "frontend/car";
	}
	
	@GetMapping("/cars/locations")
	public String findAllLocation(Model model) {
//		List<CarLocation> carLocations = locationService.findAll();
		CarLocation carLocation = locationService.findById(1);
//		model.addAttribute("carLocations", carLocations);
		model.addAttribute("location", carLocation);
		System.out.println(carLocation);
		return "frontend/car-location";
	}
	
	@GetMapping("/cars/{id}")
	public String getCar(@PathVariable Integer id, Model model) {
		CarModel carModel = modelService.findById(id);
		model.addAttribute("car", carModel);

		return "frontend/car-detail";
	}
	
	@PostMapping("/backend/cars")
	public String insertComment(@ModelAttribute CarModel carModel, 
								@RequestParam(value = "carImage", required = false) MultipartFile file) {
			try {
				String savePath = FileUploadUtil.saveFile("comment", file);
				carModel.setImage(savePath);
			} catch (IOException e) {
				e.printStackTrace();
			}
		modelService.save(carModel);
		

		return "redirect:/backend/cars";
	}
	
	
	@DeleteMapping("/backend/cars/{id}")
	public String deleteById(@PathVariable Integer id) {
		modelService.deleteById(id);
		return "redirect:/backend/cars";
	}
	
}
