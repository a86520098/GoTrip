//package com.ispan.group3.config;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import com.ispan.group3.repository.CarCompany;
//import com.ispan.group3.repository.CarCompanyRepository;
//
//@Configuration
//public class CarConfig {
//	
//	private final CarLocationService locationService;
//	private final CarModelService modelService;
//	private final CarOptionService optionService;
//	private final CarCompanyRepository companyRepository;
//	
//	@Autowired
//	public CarConfig(CarLocationService locationService, CarModelService modelService, CarOptionService optionService) {
//		this.locationService = locationService;
//		this.modelService = modelService;
//		this.optionService = optionService;
//	}
//	
//	@Autowired
//	public CarConfig(CarCompanyRepository companyRepository) {
//		this.companyRepository = companyRepository;
//	}
//	
//	@Bean
//	CommandLineRunner carCompanyRunner() {
//		return args -> {
//			List<CarCompany> companies = new ArrayList<>();
//			CarCompany company1 = new CarCompany("隔尚租車");
//			companies.add(company1);
//			CarCompany company2 = new CarCompany("合韻租車");
//			companies.add(company2);
//			CarCompany company3 = new CarCompany("安為思租車");
//			companies.add(company3);
//			companyRepository.saveAll(companies);
//		};
//	}
//	
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