//package com.ispan.group3.config;
//
//import java.time.LocalTime;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import com.ispan.group3.repository.CarLocation;
//import com.ispan.group3.repository.CarModel;
//import com.ispan.group3.repository.CarOption;
//import com.ispan.group3.service.CarLocationService;
//import com.ispan.group3.service.CarModelService;
//import com.ispan.group3.service.CarOptionService;
//
//@Configuration
//public class CarConfig {
//	
//	private final CarLocationService locationService;
//	private final CarModelService modelService;
//	private final CarOptionService optionService;
//	
//	@Autowired
//	public CarConfig(CarLocationService locationService, CarModelService modelService, CarOptionService optionService) {
//		super();
//		this.locationService = locationService;
//		this.modelService = modelService;
//		this.optionService = optionService;
//	}
//
//	@Bean
//	CommandLineRunner carLocationRunner() {
//		return args -> {
//			CarLocation location = new CarLocation("臺灣", "臺北市", "中山區", "建國北路一段71-1號", "02-2502-1389", LocalTime.of(8, 0), LocalTime.of(20, 0));
//			locationService.insertCarLocation(location);
//		};
//	}
//	
//	@Bean
//	CommandLineRunner carOptionRunner() {
//		CarLocation location = locationService.getCarLocation(1);
//		CarModel model = modelService.getCarModel(1);
//		return args -> {
//			CarOption option = new CarOption(location, model, 1800, 5);
//			optionService.insertCarOption(option);
//		};
//	}
//
//}
