//package com.ispan.group3.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class ImageUploadConfig implements WebMvcConfigurer{
//	
//	@Override
//	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//		String path = System.getProperty("user.dir") + "\\src\\main\\resources\\static\\uploadimages";
//		registry.addResourceHandler("/uploadimages/**").addResourceLocations("file:\\" + path);
//		System.out.println(path);
//	}
//
//}
