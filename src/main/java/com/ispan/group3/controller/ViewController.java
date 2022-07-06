package com.ispan.group3.controller;

import com.ispan.group3.repository.Hotel;
import com.ispan.group3.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

<<<<<<< HEAD
	@GetMapping("/toHotelIndex")
	public String toHotelIndex() {
		return "frontend/HotelIndex";
	}

	@GetMapping("/tohotelDetail")
	public String toHotelDetail(@RequestParam("id")Integer id , Model m) {
		  m.addAttribute("roomDetail",hotelservice.findById(id));
		return "frontend/ticket-detail2";
	}
=======
>>>>>>> comment

}
