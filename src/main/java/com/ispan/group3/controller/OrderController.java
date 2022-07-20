package com.ispan.group3.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ispan.group3.repository.OrderBean;
import com.ispan.group3.repository.OrderItemBean;
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
//	回傳Json物件
	@ResponseBody
	@PostMapping("/getSingleOrder")
	public OrderBean getSingleOrder(@RequestParam("orderId") Integer orderId)  {
			
			OrderBean orderBean =  orderService.findSingleOrder(orderId);
			System.out.println(orderBean.getOrderDate());
			Set<OrderItemBean> items = orderBean.getItems();
			System.out.println("items的size" + items.size());
//			List<OrderItemBean> itemlist = new ArrayList<>(items);
	  return orderService.findSingleOrder(orderId);
//			return itemlist;
	  
	}
	
	@PostMapping("/changestatus")
	public String changeStatus(@RequestParam Integer orderId) {
		
			orderService.updateOrderStatus(2, orderId);
	
		return "backend/order/orderList";
		
	}
}
