package com.ispan.group3.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ispan.group3.repository.CarLocation;
import com.ispan.group3.repository.CarModel;
import com.ispan.group3.repository.Ticket;
import com.ispan.group3.repository.TicketImage;
import com.ispan.group3.service.TicketService;
import com.ispan.group3.util.FileUploadUtil;

//使用springboot+thymeleaf时访问HTML界面失敗，只返回字符串
//可能是注解的问题：
//去掉@RestController注解换成@Controller 注解
//@RestController = @Controller + @ResponseBody.此时会返回字符串.

@Controller
public class TicketController {

	@Autowired
	private TicketService ticketService;
	
	// ======== 後台管理系統 ========
	// ---------- 門票列表 ----------
	@GetMapping("/ticketList")
	public String list(@PageableDefault(sort = { "ticketNo" }, direction = Sort.Direction.DESC, value = 50)Pageable pageable, Model model) {
		Page<Ticket> page1 = ticketService.findAllByPage(pageable);
		model.addAttribute("page", page1);
		return "backend/ticketList";
	}

	// ---------- 門票單筆資料 ----------
	@GetMapping("/ticketList/{ticketNo}")
	public String getOneData(@PathVariable long ticketNo, Model model) {
		Ticket Ticket = ticketService.getBookById(ticketNo);
		if (Ticket == null) {
			Ticket = new Ticket();
		}
		model.addAttribute("ticket", Ticket);
		return "backend/ticketDetail";
	}

	// ---------- 儲存門票資料 ----------
	@PostMapping("/ticketList")
	public String post(@ModelAttribute Ticket ticket, final RedirectAttributes attributes, @RequestParam("imagefiles") List<MultipartFile> files) {	
		 try {
//			 System.err.println("ticket"+ticket.toString());
//			 System.err.println("TicketIntro->"+ticket.getTicketIntro());
		 	Set<TicketImage> images = new HashSet<>();
		 	for (MultipartFile file : files) {
		 		try {
		 			String savePath = FileUploadUtil.saveFile("ticket", file);
		 			TicketImage ticketImage = new TicketImage(savePath, ticket);
		 			images.add(ticketImage);
		 		} catch (IOException e) {
		 			e.printStackTrace();
		 		}
		 	ticket.setImages(images);
			ticketService.save(ticket);
		 	}
		} catch (Exception e) {
			e.printStackTrace();
		}
		attributes.addFlashAttribute("message", "《" + ticket.getTicketName() + "》信息提交成功");
		return "redirect:/ticketList";
	}
	

	// ---------- 刪除門票資料 ----------
	@GetMapping("/ticketList/{ticketNo}/delete")
	public String delete(@PathVariable long ticketNo, final RedirectAttributes attributes) {
		ticketService.deleteById(ticketNo);
		attributes.addFlashAttribute("message", "信息刪除成功");
		return "redirect:/ticketList";
	}
	

	// ---------- 跳轉INPUT頁面 ----------
	@GetMapping("/ticketList/ticketInput")
	public String inputPage(Model model) {
		model.addAttribute("ticket", new Ticket());
		return "backend/ticketInput";
	}

	// ---------- 跳轉Edit頁面 ----------
	@GetMapping("/ticketList/{ticketNo}/ticketInput")
	public String inputEditPage(@PathVariable long ticketNo, Model model) {
		Ticket Ticket = ticketService.getBookById(ticketNo);
		model.addAttribute("ticket", Ticket);
		return "backend/ticketInput";
	}
	
	// ------------ Ajax ---------------
	@GetMapping("/api/tickets")
	@ResponseBody
	public List<Ticket> findTickets() {
		return ticketService.findAll();
	}
	
	// ------------ Ajax ---------------
	@GetMapping("/api/tickets/{id}")
	@ResponseBody
	public Ticket jsonFindById(@PathVariable Integer id) {
		return ticketService.findById(id).get();
	}
	
	// ========== 前台系統 ==========
	// ---------- 篩選門票種類頁面 ----------
//	@GetMapping("/ticket")
//	public String toTicket() {
//		return "frontend/ticket";
//	}
//	
//	// ---------- 門票商品頁面 ----------
//	@GetMapping("/ticket/detail/{ticketNo}")
//	public String toTicketDetail(@PathVariable long ticketNo, Model model) {
//		Ticket Ticket = ticketService.getBookById(ticketNo);
//		if (Ticket == null) {
//			Ticket = new Ticket();
//		}
//		model.addAttribute("ticket", Ticket);
//		return "frontend/ticket-detail";
//	}
	
//	// ======== 前台商家系統 ========
//	// ---------- 門票列表 ----------
//	@GetMapping("/vendor/ticket")
//	public String findAll(@PageableDefault(sort = { "ticketNo" }, direction = Sort.Direction.DESC, value = 50)Pageable pageable, Model model) {
//		Page<Ticket> page1 = ticketService.findAllByPage(pageable);
//		model.addAttribute("page", page1);
//		return "frontend/ticket/vendor-location";
//	}
//	
//	// ---------- 儲存資料 ----------
//	@PostMapping("/vendor/ticket/input")
//	public String save(@ModelAttribute Ticket ticket, final RedirectAttributes attributes, @RequestParam("imagefiles") List<MultipartFile> files) {	
//		 try {
////			 System.err.println("ticket"+ticket.toString());
////			 System.err.println("TicketIntro->"+ticket.getTicketIntro());
//		 	Set<TicketImage> images = new HashSet<>();
//		 	for (MultipartFile file : files) {
//		 		try {
//		 			String savePath = FileUploadUtil.saveFile("ticket", file);
//		 			TicketImage ticketImage = new TicketImage(savePath, ticket);
//		 			images.add(ticketImage);
//		 		} catch (IOException e) {
//		 			e.printStackTrace();
//		 		}
//		 	ticket.setImages(images);
//			ticketService.save(ticket);
//		 	}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		attributes.addFlashAttribute("message", "《" + ticket.getTicketName() + "》信息提交成功");
//		return "redirect:/vendor/ticket/form";
////		return "redirect:/vendor/cars/options/form/" + carLocation.getId();
//	}
//	
//	// ---------- 刪除門票 ----------
//	@GetMapping("/vendor/ticket/{ticketNo}")
//	public String deleteFronted(@PathVariable long ticketNo, final RedirectAttributes attributes) {
//		ticketService.deleteById(ticketNo);
//		attributes.addFlashAttribute("message", "信息刪除成功");
//		return "redirect:/vendor/ticket/";
//	}
//	
//	// ---------- 跳轉INPUT頁面 ----------
//	@GetMapping("/ticketList/ticketInput")
//	public String save(Model model) {
//		model.addAttribute("ticket", new Ticket());
//		return "backend/ticketInput";
//	}
//
//	// ---------- 跳轉Edit頁面 ----------
//	@GetMapping("/ticketList/{ticketNo}/ticketInput")
//	public String edit(@PathVariable long ticketNo, Model model) {
//		Ticket Ticket = ticketService.getBookById(ticketNo);
//		model.addAttribute("ticket", Ticket);
//		return "backend/ticketInput";
//	}
}




//@GetMapping({"/backend/tickets/ticketList", "/backend/tickets/ticketList/{ticketNo}"})
//public String showCarForm(Model model, @PathVariable(required = false) Long ticketNo) {
//	Ticket ticket;
//	if (ticketNo != null) {
//		ticket = TicketService.getBookById(ticketNo);
//	} else {
//		ticket = new Ticket();			
//	}
//	model.addAttribute("ticket", ticket);
//	return "backend/ticketInput";
//}
