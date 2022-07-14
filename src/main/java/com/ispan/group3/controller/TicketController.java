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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

//	@GetMapping({"/backend/tickets/ticketList", "/backend/tickets/ticketList/{ticketNo}"})
//	public String showCarForm(Model model, @PathVariable(required = false) Long ticketNo) {
//		Ticket ticket;
//		if (ticketNo != null) {
//			ticket = TicketService.getBookById(ticketNo);
//		} else {
//			ticket = new Ticket();			
//		}
//		model.addAttribute("ticket", ticket);
//		return "backend/ticketInput";
//	}
	
	/**
	 * 獲取列表
	 * @PageableDefault(sort = { "ticketNo" }, direction = Sort.Direction.DESC, value = 50)
	 * @param model
	 * @return
	 */
	// 找templates下面的book.html
	// 這就是引入Thymeleaf模版(pom.xml要註冊)
	// @PageableDefault : 針對分頁傳參數; sort ={"id"}排序
	@GetMapping("/ticketList")
	public String list(@PageableDefault(sort = { "ticketNo" }, direction = Sort.Direction.DESC, value = 50)Pageable pageable,
			Model model) {

		Page<Ticket> page1 = ticketService.findAllByPage(pageable);
		// StringBuilder sbOpen_week = new StringBuilder();
		// Map<String, String> weekNameMap = new HashMap<String, String>();
		// weekNameMap.put("1", "星期一");
		// weekNameMap.put("2", "星期二");
		// weekNameMap.put("3", "星期三");
		// weekNameMap.put("4", "星期四");
		// weekNameMap.put("5", "星期五");
		// weekNameMap.put("6", "星期六");
		// weekNameMap.put("7", "星期日");

		// for (Ticket Ticket : page1) { // 每筆record
		// 	String Open_weekStr = Ticket.getTicketOpenWeek() == null ? "" : Ticket.getTicketOpenWeek();
		// 	String[] Open_weekArr = Open_weekStr.split(",");
		// 	for (String TicketOpenWeek : Open_weekArr) {
		// 		if ("".equals(TicketOpenWeek)) {
		// 			break;
		// 		}
		// 		sbOpen_week.append(weekNameMap.get(TicketOpenWeek));
		// 		sbOpen_week.append(",");
		// 	}
		// 	String TicketOpenWeek = sbOpen_week.length() > 0 ? sbOpen_week.substring(0, sbOpen_week.length() - 1) : "";
		// 	Ticket.setTicketOpenWeek(TicketOpenWeek);
		// 	sbOpen_week.setLength(0);
		// }
//		for (Ticket Ticket : page1) { // 每筆record
//			String TicketIntro= Ticket.getTicketIntro();
//			if(TicketIntro==null) {
//				TicketIntro = "  ";
//			}
//			int Lastindex = TicketIntro.length() > 20 ? 19: TicketIntro.length()-1;
//			System.err.println("Lastindex->"+Lastindex);
//			Ticket.setTicketIntro(TicketIntro.substring(0, Lastindex ));
//		}
		model.addAttribute("page", page1);
		return "backend/ticketList";
	}

	/**
	 * 獲取書單單筆資料
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	// 獲取單筆資料
	// Model model 前端模版頁面
	@GetMapping("/ticketList/{ticketNo}")
	public String getOneData(@PathVariable long ticketNo, Model model) {
		Ticket Ticket = ticketService.getBookById(ticketNo);
		if (Ticket == null) {
			Ticket = new Ticket();
		}
		model.addAttribute("ticket", Ticket);
		return "backend/ticketDetail";
		// book.html(模版名)
	}

	/**
	 * 跳轉input提交頁面
	 * 
	 * @return
	 */
	@GetMapping("/ticketList/ticketInput")
	public String inputPage(Model model) {
		model.addAttribute("ticket", new Ticket());
		return "backend/ticketInput";
	}

	/**
	 * 跳轉到更新頁面
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	// books.html -> model.addAttribute("ticket",ticketBean); -> "ticket"
	// 對應thymeleaf中的<tr th:each="ticket,iterStat:${page.content}">
	// input.html -> <form action="/books" th:action="@{/books}"
	// th:object="${ticket}" method="post">
	// book.html -> <body th:object="${ticket}">
	@GetMapping("/ticketList/{ticketNo}/ticketInput")
	public String inputEditPage(@PathVariable long ticketNo, Model model) {
		Ticket Ticket = ticketService.getBookById(ticketNo);
		model.addAttribute("ticket", Ticket);
		return "backend/ticketInput";
	}

	/**
	 * 提交一個書單資料 或是一筆一筆@RequestParam加資料進去
	 * 
	 * @param book
	 * @return
	 */
	/**
	 * Post ---> redirect ---> Get RedirectAttributes 跨過 redirect步驟
	 * 
	 * @param Ticket
	 * @param model
	 * @return
	 */
	@PostMapping("/ticketList")
	public String post(@ModelAttribute Ticket ticket, final RedirectAttributes attributes, 
			@RequestParam("imagefiles") List<MultipartFile> files) {
		
		 try {
			 System.err.println("ticket"+ticket.toString());
			 System.err.println("TicketIntro->"+ticket.getTicketIntro());
		 	Set<TicketImage> images = new HashSet<>();
		 	for (MultipartFile file : files) {
		 		try {
		 			String savePath = FileUploadUtil.saveFile("ticket", file);
		 			TicketImage ticketImage = new TicketImage(savePath, ticket);
		 			images.add(ticketImage);
		 		} catch (IOException e) {
		 			e.printStackTrace();
		 		}
//		 	}
		 	ticket.setImages(images);
			ticketService.save(ticket);
		 	}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// ticketService.save(ticket);
		attributes.addFlashAttribute("message", "《" + ticket.getTicketName() + "》信息提交成功");

		// List<Book> books = bookService.findAll();
		// model.addAttribute("books", books);
		// return "books";
		return "redirect:/ticketList";
	}
	


	@GetMapping("/ticketList/{ticketNo}/delete")
	public String delete(@PathVariable long ticketNo, final RedirectAttributes attributes) {
		ticketService.deleteById(ticketNo);
		attributes.addFlashAttribute("message", "信息刪除成功");
		return "redirect:/ticketList";
	}
	
	
	@GetMapping("/api/tickets")
	@ResponseBody
	public List<Ticket> findTickets() {
		return ticketService.findAll();
	}
	
	@GetMapping("/api/tickets/{id}")
	@ResponseBody
	public Ticket jsonFindById(@PathVariable Integer id) {
		return ticketService.findById(id).get();
	}
}
//	@PostMapping("/ticketList")
//	public String post(@ModelAttribute Ticket ticket, final RedirectAttributes attributes, 
//			@RequestParam("image") MultipartFile files) {
	
//		 try {
//			 System.err.println("ticket"+ticket.toString());
//			 System.err.println("TicketIntro->"+ticket.getTicketIntro());
//		 	Set<TicketImage> images = new HashSet<>();
////		 	for (MultipartFile file : files) {
//		 		try {
//		 			String savePath = FileUploadUtil.saveFile("ticket", files);
//		 			TicketImage ticketImage = new TicketImage(savePath, ticket);
//		 			images.add(ticketImage);
//		 		} catch (IOException e) {
//		 			e.printStackTrace();
//		 		}
////		 	}
//		 	ticket.setImages(images);
//			ticketService.save(ticket);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		// ticketService.save(ticket);
//		attributes.addFlashAttribute("message", "《" + ticket.getTicketName() + "》信息提交成功");

//		// List<Book> books = bookService.findAll();
//		// model.addAttribute("books", books);
//		// return "books";
//		return "redirect:/ticketList";
//	}