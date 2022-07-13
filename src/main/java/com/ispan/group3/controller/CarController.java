package com.ispan.group3.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.ispan.group3.repository.CarLocation;
import com.ispan.group3.repository.CarModel;
import com.ispan.group3.repository.CarOption;
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

	// 後台管理系統
	@GetMapping({ "/backend/cars", "/backend/cars/models" })
	public String findAllModelsBk(Model model) {
		List<CarModel> carModels = modelService.findAll();
		model.addAttribute("carModels", carModels);
		return "backend/car-list";
	}

	@GetMapping({ "/backend/cars/form" })
	public String showNewCarForm(Model model) {
		CarModel carModel = new CarModel();
		model.addAttribute("carModel", carModel);
		return "backend/car-new-form";
	}

	@GetMapping({ "/backend/cars/form/{id}" })
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

	@GetMapping("/cars")
	public String findAllModel(Model model) {
		List<CarModel> carModels = modelService.findAll();
		model.addAttribute("carModels", carModels);
		return "frontend/car";
	}

	@GetMapping("/cars/locations")
	public String findAllLocation(Model model) {
		List<CarLocation> carLocations = locationService.findAll();
		model.addAttribute("carLocations", carLocations);
		return "frontend/car-location";
	}

	@GetMapping("/cars/{id}")
	public String findById(@PathVariable Integer id, Model model) {
		CarModel carModel = modelService.findById(id);
		model.addAttribute("car", carModel);
		return "frontend/car-detail";
	}

	@GetMapping({ "/cars/locations/form", "/cars/locations/form/{id}" })
	public String showNewForm(@PathVariable(required = false) Integer id, Model model) {
		CarLocation carLocation;
		if (id != null) {
			carLocation = locationService.findById(id);
		} else {
			carLocation = new CarLocation();
		}
		model.addAttribute("carLocation", carLocation);
		List<CarModel> existModels = modelService.findAll();
		model.addAttribute("existModels", existModels);
		return "frontend/car-location-form";
	}

//	@PostMapping(value = "/cars/locations/save", params = "addRow")
//	public String addRow(CarLocation carLocation, final BindingResult bindingResult) {
//		carLocation.getCarOptions().add(new CarOption());
//		return "frontend/car-location-form";
//	}
	
	@PostMapping("/cars/locations")
	public String save(@ModelAttribute CarLocation carLocation) {
		
		locationService.save(carLocation);

		return "redirect:/cars/locations";
	}

}
