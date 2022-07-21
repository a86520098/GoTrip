package com.ispan.group3.controller;

import java.io.IOException;
import java.util.List;
import java.util.function.Predicate;

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
import com.ispan.group3.repository.Comment;
import com.ispan.group3.service.CarLocationService;
import com.ispan.group3.service.CarModelService;
import com.ispan.group3.service.CarOptionService;
import com.ispan.group3.util.FileUploadUtil;

@Controller
public class CarController {

	private final CarModelService modelService;
	private final CarLocationService locationService;
	private final CarOptionService optionService;

	@Autowired
	public CarController(CarModelService modelService, CarLocationService locationService, CarOptionService optionService) {
		this.modelService = modelService;
		this.locationService = locationService;
		this.optionService = optionService;
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
	public String deleteByIdBk(@PathVariable Integer id) {
		modelService.deleteById(id);
		return "redirect:/backend/cars";
	}


	// ========== 前台系統 ==========
	// ---------- 車款找車 ----------
	@GetMapping({"/cars", "/cars/models"})
	public String findAllModel(Model model) {
		List<CarModel> carModels = modelService.findAll();
		model.addAttribute("carModels", carModels);
		return "frontend/car/car-model";
	}

	// ---------- 地圖找車 ----------
	@GetMapping("/cars/locations")
	public String findAllLocation(Model model) {
		List<CarLocation> carLocations = locationService.findAll();
		Predicate<CarLocation> condition = carLocation -> carLocation.getStatus().equals("隱藏");
		carLocations.removeIf(condition);
		model.addAttribute("carLocations", carLocations);
		return "frontend/car/car-location";
	}

	// ---------- 車款頁面 ----------
	@GetMapping("/cars/options/{id}")
	public String findById(@PathVariable Integer id, Model model) {
		CarOption carOption = optionService.findById(id);
		Comment comment = new Comment();
		model.addAttribute("option", carOption);
		model.addAttribute("comment", comment);
		return "frontend/car/car-detail";
	}


	// ======== 前台商家系統 ========
	// ---------- 地圖找車 ----------
	@GetMapping({"/vendor/cars/locations", "/vendor/cars/locations/{companyId}"})
	public String findByCompany(@PathVariable(required = false) Integer companyId, Model model) {
		List<CarLocation> carLocations;
		if (companyId != null) {
			carLocations = locationService.findByCompany(companyId);
		} else {
			carLocations = locationService.findByCompany(1);
		}
		
		model.addAttribute("carLocations", carLocations);
		return "frontend/car/vendor-location";
	}

	// ---------- 地點表單 ----------
	@GetMapping({ "/vendor/cars/locations/form", "/vendor/cars/locations/form/{id}" })
	public String showLocForm(@PathVariable(required = false) Integer id, Model model) {
		CarLocation carLocation = new CarLocation();
		if (id != null) {
			carLocation = locationService.findById(id);
		}
		model.addAttribute("carLocation", carLocation);
		List<CarModel> existModels = modelService.findAll();
		model.addAttribute("existModels", existModels);
		return "frontend/car/vendor-loc-form";
	}
	
	// ---------- 儲存地點 ----------
	@PostMapping("/vendor/cars/locations")
	public String save(@ModelAttribute CarLocation carLocation, 
					   @RequestParam String closeTime, @RequestParam String openTime, 
					   @RequestParam(value = "imagefile", required = false) MultipartFile file) {
		carLocation.setCloseTime(closeTime);
		carLocation.setOpenTime(openTime);
		if (file != null) {
			try {
				String savePath = FileUploadUtil.saveFile("car", file);
				carLocation.setImage(savePath);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		locationService.save(carLocation);
		return "redirect:/vendor/cars/locations/" + carLocation.getCompanyId();
	}

	// ---------- 方案表單 ----------
	@GetMapping("/vendor/cars/options/form/{locationId}")
	public String showOptForm(@PathVariable(required = false) Integer locationId, Model model) {
		List<CarModel> carModels = modelService.findAll();
		CarLocation carLocation = new CarLocation();
		if (locationId != null) {
			carLocation = locationService.findById(locationId);
		}
		model.addAttribute("carLocation", carLocation);
		model.addAttribute("carModels", carModels);
		return "frontend/car/vendor-opt-form";
	}

	// ---------- 儲存選項 ----------
	@PostMapping("/vendor/cars/options")
	public String saveOpt(@ModelAttribute CarLocation carLocation, 
						  @RequestParam(value = "deleteOpts", required = false) List<Integer> deleteOpts) {
		List<CarOption> carOptions = carLocation.getCarOptions();
		for (CarOption option: carOptions) {
			optionService.save(option);
		}
		if (deleteOpts != null) {
			for (Integer deleteOpt : deleteOpts) {
				optionService.deleteById(deleteOpt);
			}
		}
		return "redirect:/vendor/cars/locations";
	}
	
    // Request is accepted by the endpoint only if contains "save" parameter.
//    @PostMapping(path = {"/vendor/cars/options/", "/vendor/cars/options/{id}"}, params = "save")
//    public String saveOrder(Order order) {
//        orderService.save(order);
//        return "order";
//    }

//    @PostMapping(params = "addOption", path = "/vendor/cars/options")
//    public String addOrder(@ModelAttribute CarLocation carLocation, HttpServletRequest request) {
//    	
//    	carLocation.getCarOptions().add(new CarOption());
//        if (AJAX_HEADER_VALUE.equals(request.getHeader(AJAX_HEADER_NAME))) {
//            // It is an Ajax request, render only #items fragment of the page.
//            return "frontend/car/vendor-opt-form::#options";
//        } else {
//            // It is a standard HTTP request, render whole page.
//            return "frontend/car/vendor-opt-form";
//        }
//    }
//
//    // "removeItem" parameter contains index of a item that will be removed.
//    @PostMapping(params = "removeOption", path = "/vendor/cars/options")
//    public String removeOrder(@ModelAttribute CarLocation carLocation, @RequestParam("removeOption") int index, HttpServletRequest request) {
//    	System.out.println("Im here to remove");
//    	carLocation.getCarOptions().remove(index);
//        if (AJAX_HEADER_VALUE.equals(request.getHeader(AJAX_HEADER_NAME))) {
//            return "frontend/car/vendor-opt-form::#options";
//        } else {
//            return "frontend/car/vendor-opt-form";
//        }
//    }
	

	// ---------- 刪除據點 ----------
	@DeleteMapping("/vendor/cars/locations/{id}")
	public String deleteById(@PathVariable Integer id) {
		List<CarOption> options = locationService.findById(id).getCarOptions();
		optionService.deleteAllInBatch(options);
		locationService.deleteById(id);
		return "redirect:/vendor/cars/locations";
	}

}