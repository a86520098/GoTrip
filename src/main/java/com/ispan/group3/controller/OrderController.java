package com.ispan.group3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ispan.group3.repository.OrderBean;
import com.ispan.group3.service.OrderService;

// 最上面也有mapping路徑
@Controller
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private OrderService orderService;

	@GetMapping("/orderlist")
	public String processAllQuery(Model m) throws Exception {
		
		List<OrderBean> orderBeans = orderService.findAllOrder();
				
		m.addAttribute("orderBeans", orderBeans);
		
		return "backend/order/orderList";
	}
	
	@GetMapping(value = "/newform")
	public String processNewForm(Model m) {
		m.addAttribute("orderBean",new OrderBean());
		return "backend/order/newOrder";
	}

	
	@GetMapping(value = "/edit/{orderId}")
	public String processEditForm(@PathVariable("orderId") Integer orderId,Model m) throws Exception {
					
		m.addAttribute("orderBean", orderService.findSingleOrder(orderId));
					
		return "backend/order/newOrder";
	}
	
 
	@GetMapping(value = "/delete/{orderId}")
	public String processDeleteOrder(@PathVariable("orderId") Integer orderid,Model m) throws Exception {
		
		
		orderService.deleteOrder(orderid);

		return "redirect:/order/orderlist";
	}
	
}
