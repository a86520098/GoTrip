package com.ispan.group3.controller;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

import com.ispan.group3.repository.CarModel;
import com.ispan.group3.repository.Comment;
import com.ispan.group3.repository.CommentImage;
import com.ispan.group3.service.CarModelService;
import com.ispan.group3.util.FileUploadUtil;

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
	
	@PostMapping("/backend/cars")
	public String insertComment(@ModelAttribute CarModel carModel, 
								@RequestParam(value = "carImage", required = false) MultipartFile file) {
			try {
				String savePath = FileUploadUtil.saveFile("comment", file);
				carModel.setImage("/data/uploadimages/car/toyota-yaris.png");
			} catch (IOException e) {
				e.printStackTrace();
			}
		modelService.insertCarModel(carModel);
		

		return "redirect:/backend/cars";
	}
	
	
	@DeleteMapping("/backend/cars/{id}")
	public String deleteComment(@PathVariable Integer id) {
		modelService.deleteCarModel(id);
		return "redirect:/backend/cars";
	}
	
}
