package com.ispan.group3.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ispan.group3.repository.OrderBean;
import com.ispan.group3.service.impl.OrderServiceImpl;

// 最上面也有mapping路徑
@Controller
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private OrderServiceImpl orderServiceImpl;

	@GetMapping("/orderlist")
	public String processAllQuery(Model m) throws Exception {
		
		List<OrderBean> orderBeans = orderServiceImpl.findAllOrder();
				
		m.addAttribute("orderBeans", orderBeans);
		
		return "backend/order/orderList";
	}
	
	@GetMapping(value = "/newform")
	public String processNewForm(Model m) {
		m.addAttribute("orderBean",new OrderBean());
		return "backend/order/newOrder";
	}
	
	@PostMapping(value = "/save")
	public String processInsertOrder(OrderBean orderBean) throws Exception {
		
//		orderBean.setOrderDate(new SimpleDateFormat("yyyy/MM/dd HH:mm").format(Calendar.getInstance().getTime()));
		
		if (orderBean.getOrderDate().isEmpty()) {
			orderBean.setOrderDate(new SimpleDateFormat("yyyy/MM/dd HH:mm").format(new Date()));
		}
//		System.out.println(orderBean.getOrderDate());
		System.out.println(orderBean.getOrderDate());
		
		orderServiceImpl.insertOrder(orderBean);
		
		return "redirect:/order/orderlist";
	}
	
	@GetMapping(value = "/edit/{orderId}")
	public String processEditForm(@PathVariable("orderId") Integer orderId,Model m) throws Exception {
					
		m.addAttribute("orderBean", orderServiceImpl.findSingleOrder(orderId));
					
		return "backend/order/newOrder";
	}
	
 
	@GetMapping(value = "/delete/{orderId}")
	public String processDeleteOrder(@PathVariable("orderId") Integer orderid,Model m) throws Exception {
		
		
		orderServiceImpl.deleteOrder(orderid);
//		List<OrderBean> orderBeans = oService.selectAll();
//		m.addAttribute("orderBeans", orderBeans);
//		
//		return "index";
		return "redirect:/order/orderlist";
	}
	
}
