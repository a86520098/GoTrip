package com.ispan.group3.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ispan.group3.repository.ticketBean;
import com.ispan.group3.service.ticketService;

//使用springboot+thymeleaf时访问HTML界面失敗，只返回字符串
//可能是注解的问题：
//去掉@RestController注解换成@Controller 注解
//@RestController = @Controller + @ResponseBody.此时会返回字符串.

@Controller
public class ticketController {

	@Autowired
	private ticketService ticketService;

	/**
     * 獲取列表
     * @param model
     * @return
     */
	// 找templates下面的book.html
	// 這就是引入Thymeleaf模版(pom.xml要註冊)
	//  @PageableDefault : 針對分頁傳參數; sort ={"id"}排序
	@GetMapping("/ticketList")
	public String list(@PageableDefault(size = 10,sort ={"ticketNo"}, direction = Sort.Direction.DESC) Pageable pageable,Model model) {
		Page<ticketBean> page1 = ticketService.findAllByPage(pageable);
		StringBuilder sbOpen_week = new StringBuilder();
		Map<String, String> weekNameMap = new HashMap<String, String>();
		weekNameMap.put("1", "星期一");
		weekNameMap.put("2", "星期二");
		weekNameMap.put("3", "星期三");
		weekNameMap.put("4", "星期四");
		weekNameMap.put("5", "星期五");
		weekNameMap.put("6", "星期六");
		weekNameMap.put("7", "星期日");

		for (ticketBean ticketBean : page1) { // 每筆record
			int i = 1;
			String Open_weekStr = ticketBean.getTicketOpenWeek() == null ? "" : ticketBean.getTicketOpenWeek();
			String[] Open_weekArr = Open_weekStr.split(",");
			for (String TicketOpenWeek : Open_weekArr) {
				if ("".equals(TicketOpenWeek)) {
					break;
				}
				sbOpen_week.append(weekNameMap.get(TicketOpenWeek));
				sbOpen_week.append(",");
			}
			String TicketOpenWeek = sbOpen_week.length() > 0 ? sbOpen_week.substring(0, sbOpen_week.length() - 1) : "";
			ticketBean.setTicketOpenWeek(TicketOpenWeek);
			sbOpen_week.setLength(0);
		}
		model.addAttribute("page", page1);
		return "ticketList";
	}
	
	/**
     * 獲取書單單筆資料
     * @param id
     * @param model
     * @return
     */
	// 獲取單筆資料
	// Model model 前端模版頁面
	@GetMapping("/ticketList/{ticketNo}")
	public String getOneData(@PathVariable long ticketNo, Model model) {
		ticketBean ticketBean = ticketService.getBookById(ticketNo);
		if (ticketBean == null) {
			ticketBean = new ticketBean();
		}
		model.addAttribute("ticket", ticketBean);
		return "ticketDetail";
		// book.html(模版名)
	}
	/**
	 * 跳轉input提交夜面
	 * @return
	 */
	@GetMapping("/ticketList/ticketInput")
	public String inputPage(Model model) {
		model.addAttribute("ticket", new ticketBean());
		return "ticketInput";
	}
	
	/**
	 * 跳轉到更新頁面
	 * @param id
	 * @param model
	 * @return
	 */
//	books.html -> model.addAttribute("ticket",ticketBean); -> "ticket" 對應thymeleaf中的<tr th:each="ticket,iterStat:${page.content}">
//	input.html -> <form action="/books" th:action="@{/books}" th:object="${ticket}" method="post">	
//	book.html -> <body th:object="${ticket}">
	@GetMapping("/ticketList/{ticketNo}/ticketInput")
	public String inputEditPage(@PathVariable long ticketNo, Model model) {
		ticketBean ticketBean = ticketService.getBookById(ticketNo);
		model.addAttribute("ticket",ticketBean);
		return "ticketInput";
	}
	
	/**
	 * 提交一個書單資料
	 * 或是一筆一筆@RequestParam加資料進去
	 * @param book
	 * @return
	 */
	/**
	 * Post ---> redirect ---> Get
	 * RedirectAttributes 跨過 redirect步驟
	 * 
	 * @param ticketBean
	 * @param model
	 * @return
	 */
	@PostMapping("/ticketList")
	public String post(ticketBean ticketBean, final RedirectAttributes attributes) {
		ticketBean ticket= ticketService.save(ticketBean);
		if(ticket != null) {
			attributes.addFlashAttribute("message", "《"+ticket.getTicketName()+"》信息提交成功");
		}
//		List<Book> books = bookService.findAll();
//		model.addAttribute("books", books);
//		return "books";
		return "redirect:/ticketList";
	}
	
	@GetMapping("/ticketList/{ticketNo}/delete")
	public String delete(@PathVariable long ticketNo, final RedirectAttributes attributes) {
		ticketService.deleteById(ticketNo);
		attributes.addFlashAttribute("message", "信息刪除成功");
		return "redirect:/ticketList";
		}
	}
	
//	/**
//	 * 讀取讀書清單列表
//	 * 排序上有問題
//	 * 從BookApp.java抓來的
//	 * @return
//	 */
//	@GetMapping("/books")
//	public Page<Book> getAll(@PageableDefault(size = 5, sort ={"ticketNo"}, direction = Sort.Direction.DESC) Pageable pageable) {
//		return bookService.findAllByPage(pageable);
//	}
	

