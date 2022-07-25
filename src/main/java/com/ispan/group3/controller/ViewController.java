package com.ispan.group3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ispan.group3.repository.CarOption;
import com.ispan.group3.repository.Comment;
import com.ispan.group3.repository.Hotel;
import com.ispan.group3.repository.Ticket;
import com.ispan.group3.service.CarOptionService;
import com.ispan.group3.service.CommentService;
import com.ispan.group3.service.HotelService;
import com.ispan.group3.service.TicketService;

@Controller
public class ViewController {
	
	private final TicketService ticketService;
	private final HotelService hotelService;
	private final CarOptionService carService;
	private final CommentService commentService;
	
	@Autowired
	public ViewController(TicketService ticketService, HotelService hotelService, CarOptionService carService, CommentService commentService) {
		this.ticketService = ticketService;
		this.hotelService = hotelService;
		this.carService = carService;
		this.commentService = commentService;
		
	}
	
	@GetMapping({"/index", "/"})
	public String toIndex(Model model) {
		List<Ticket> tickets = ticketService.findAll();
		List<Hotel> hotels = hotelService.findAll();
		List<CarOption> cars = carService.findAll();
		model.addAttribute("cars",cars);
		model.addAttribute("hotels",hotels);
		model.addAttribute("tickets",tickets);
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
	public String toBackend(Model model) {
		List<Ticket> tickets = ticketService.findAll();
		List<Hotel> hotels = hotelService.findAll();
		List<CarOption> cars = carService.findAll();
		List<Comment> comments = commentService.findAll();
		model.addAttribute("cars",cars);
		model.addAttribute("hotels",hotels);
		model.addAttribute("tickets",tickets);
		model.addAttribute("comments",comments);
		return "backend/index";
	}






}
