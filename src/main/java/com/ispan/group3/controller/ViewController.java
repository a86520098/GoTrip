package com.ispan.group3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
	
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

}
