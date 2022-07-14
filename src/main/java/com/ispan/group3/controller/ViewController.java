package com.ispan.group3.controller;

import com.ispan.group3.repository.Ticket;
import com.ispan.group3.service.HotelService;
import com.ispan.group3.service.TicketService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ViewController {
	@Autowired
	HotelService hotelservice;
	@Autowired
	TicketService ticketService;
	
	@GetMapping({"/index", "/"})
	public String toIndex() {
		return "frontend/index";
	}
	
	@GetMapping("/ticket")
	public String toTicket() {
		return "frontend/ticket";
	}
	
	@GetMapping("/ticket/detail/{ticketNo}")
	public String toTicketDetail(@PathVariable long ticketNo, Model model) {
		Ticket Ticket = ticketService.getBookById(ticketNo);
		if (Ticket == null) {
			Ticket = new Ticket();
		}
		model.addAttribute("ticket", Ticket);
		return "frontend/ticket-detail";
	}
	
	@GetMapping("/backend/index")
	public String toBackend() {
		return "backend/index";
	}






}
