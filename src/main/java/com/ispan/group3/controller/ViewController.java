package com.ispan.group3.controller;

import com.ispan.group3.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
	@Autowired
	HotelService hotelservice;
	@GetMapping({"/index", "/"})
	public String toIndex() {
		return "frontend/index";
	}
	
	@GetMapping("/ticket")
	public String toTicket() {
		return "frontend/ticket";
	}
	
	@GetMapping("/ticket/detail")
	public String toTicketDetail() {
		return "frontend/ticket-detail";
	}
	
	@GetMapping("/backend/index")
	public String toBackend() {
		return "backend/index";
	}






}
