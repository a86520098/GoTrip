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

	// ======== 後台管理系統 ========
	// ---------- 車款列表 ----------
	@GetMapping({ "/backend/cars", "/backend/cars/models" })
	public String findAllCarBk(Model model) {
		List<CarModel> carModels = modelService.findAll();
		model.addAttribute("carModels", carModels);
		return "backend/car/car-model";
	}

	// ---------- 地點列表 ----------
	@GetMapping("/backend/cars/locations")
	public String findAllLocBk(Model model) {
		List<CarLocation> carLocations = locationService.findAll();
		model.addAttribute("carLocations",carLocations);
		return "backend/car/car-location";
	}

	// ---------- 車款表單 ----------
	@GetMapping({"/backend/cars/form", "/backend/cars/form/{id}" })
	public String showCarForm(Model model, @PathVariable(required = false) Integer id) {
		CarModel carModel;
		if (id != null) {
			carModel = modelService.findById(id);
		} else {
			carModel = new CarModel();
		}
		model.addAttribute("carModel", carModel);
		return "backend/car/car-form";
	}

	// ---------- 儲存車款 ----------
	@PostMapping("/backend/cars")
	public String saveCar(@ModelAttribute CarModel carModel,
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

	// ---------- 刪除車款 ----------
	@DeleteMapping("/backend/cars/{id}")
	public String deleteById(@PathVariable Integer id) {
		modelService.deleteById(id);
		return "redirect:/backend/cars";
	}

	// ========== 前台系統 ==========
	// ---------- 車款找車 ----------
	@GetMapping("/cars")
	public String findAllModel(Model model) {
		List<CarModel> carModels = modelService.findAll();
		model.addAttribute("carModels", carModels);
		return "frontend/car/car-model";
	}

	// ---------- 地圖找車 ----------
	@GetMapping("/cars/locations")
	public String findAllLocation(Model model) {
		List<CarLocation> carLocations = locationService.findAll();
		model.addAttribute("carLocations", carLocations);
		return "frontend/car/car-location";
	}

	// ---------- 車款頁面 ----------
	@GetMapping("/cars/{id}")
	public String findById(@PathVariable Integer id, Model model) {
		CarModel carModel = modelService.findById(id);
		model.addAttribute("car", carModel);
		return "frontend/car/car-detail";
	}

	// ---------- 地點表單 ----------
	@GetMapping({ "/cars/locations/form", "/cars/locations/form/{id}" })
	public String showLocForm(@PathVariable(required = false) Integer id, Model model) {
		CarLocation carLocation = new CarLocation();
		if (id != null) {
			carLocation = locationService.findById(id);
		} 
		model.addAttribute("carLocation", carLocation);
		List<CarModel> existModels = modelService.findAll();
		model.addAttribute("existModels", existModels);
		if (id != null) {
			return "redirect:/cars/options/form" + id;
		}
		return "redirect:/cars/options/form";

	}
	
	// ---------- 儲存地點 ----------
	@PostMapping("/cars/locations")
	public String save(@ModelAttribute CarLocation carLocation) {
		List<CarOption> carOptions = locationService.findById(carLocation.getId()).getCarOptions();
		carLocation.setCarOptions(carOptions);
		locationService.save(carLocation);
		return "redirect:/cars/locations";
	}
	
	// ---------- 方案表單 ----------
	@GetMapping({ "/cars/options/form", "/cars/options/form/{id}" })
	public String showOptForm(@PathVariable(required = false) Integer id, Model model) {
		CarLocation carLocation = new CarLocation();
		List<CarOption> carOptions = carLocation.getCarOptions();
		if (id != null) {
			carLocation = locationService.findById(id);
			carOptions = carLocation.getCarOptions();
		}
		model.addAttribute("carOptions", carOptions);
		return "frontend/car/car-option-form";
	}

}
