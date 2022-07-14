package com.ispan.group3.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ispan.group3.repository.CarModel;
import com.ispan.group3.repository.Hotel;
import com.ispan.group3.repository.OrderBean;
import com.ispan.group3.repository.OrderItemBean;
import com.ispan.group3.repository.ShoppingCart;
import com.ispan.group3.repository.Ticket;
import com.ispan.group3.service.CarModelService;
import com.ispan.group3.service.HotelService;
import com.ispan.group3.service.OrderService;
import com.ispan.group3.service.TicketService;

@Controller
@SessionAttributes({"ShoppingCart"})
public class ShoppingCartController {
	
	private HotelService hotelService;
	
	private TicketService ticketService;
	
	private CarModelService carModelService;
	
	private OrderService orderService;
	
	@Autowired	
	public ShoppingCartController(HotelService hotelService, TicketService ticketService,
			CarModelService carModelService, OrderService orderService) {
		super();
		this.hotelService = hotelService;
		this.ticketService = ticketService;
		this.carModelService = carModelService;
		this.orderService = orderService;
	}

//	@ResponseStatus(value = HttpStatus.NO_CONTENT) 返回204 
	@GetMapping("/addToCart")
	@ResponseBody
	public ShoppingCart addToCart(Model model,
				@RequestParam("productId") Integer productId,
				@RequestParam("type") String type,
				@RequestParam("qty") Integer qty) {
		
		// 取出存放在session物件內的ShoppingCart物件
				ShoppingCart cart = (ShoppingCart) model.getAttribute("ShoppingCart");
				
				
				// 如果找不到ShoppingCart物件
				if (cart == null) {
					// 就新建ShoppingCart物件
					cart = new ShoppingCart();
					// 並將此新建ShoppingCart的物件放到session物件內，成為它的屬性物件
					model.addAttribute("ShoppingCart", cart);   
				}
//				宣告購物車商品變數
				OrderItemBean oib;
				System.out.println("是否到這");
				String oId = null;
				switch (type) {
				case "hotel":
					Hotel hotelBean = hotelService.findById(productId);	
//				 將訂單資料(價格，數量，折扣與BookBean)封裝到OrderItemBean物件內
					 oib = new OrderItemBean(productId,type,hotelBean.getHotel_name(), 
							hotelBean.getPrice(), qty,hotelBean.getPhone()); 
					 System.out.println("執行?");
//					 替每種商品設定特定的key
					 	oId	= "h" + String.valueOf(productId);
					 	
//				 將OrderItem物件.每件商品的key內加入ShoppingCart的物件內
					 	cart.addToCart(oId,oib);
					break;
				case "ticket":
					Ticket ticket = ticketService.findById(productId).get();
//					 將訂單資料(價格，數量，折扣與BookBean)封裝到OrderItemBean物件內
					 oib = new OrderItemBean(productId,type,ticket.getTicketName(),
							 ticket.getPrice(),qty,Integer.parseInt(ticket.getPhone())); 
					 
//					 替每種商品設定特定的key
					 oId = "t" + String.valueOf(productId);
					 
//					 將OrderItem物件.每件商品的key內加入ShoppingCart的物件內
						cart.addToCart(oId,oib);
						
					break;
				case "car":	
					CarModel car= carModelService.findById(productId);
//					 將訂單資料(價格，數量，折扣與BookBean)封裝到OrderItemBean物件內
					 oib = new OrderItemBean(productId,type,car.getType(),
							 car.getSeat(),qty,car.getSeat()); 
					 
//					 替每種商品設定特定的key
					oId = "c" + String.valueOf(productId);
					
//					 將OrderItem物件.每件商品的key加入ShoppingCart的物件內
						cart.addToCart(oId,oib);
					break;	
				default:
					break;
				}
				
				
				System.out.println("是否執行到此");
				return cart;
	}
	//	購物車頁面
	@GetMapping("/showCart")
	public String showCart(Model model) {
		
		// 取出存放在session物件內的ShoppingCart物件
		ShoppingCart cart = (ShoppingCart) model.getAttribute("ShoppingCart");
		
		
		// 如果找不到ShoppingCart物件
		if (cart == null) {
			// 就新建ShoppingCart物件
			cart = new ShoppingCart();
			// 並將此新建ShoppingCart的物件放到session物件內，成為它的屬性物件
			model.addAttribute("ShoppingCart", cart);   
		}
		
		return "frontend/shopingcart";
	}
	
	
	@GetMapping("/creatOrder")
	public String creatOrder(Model model,RedirectAttributes redirectAttributes) {
		
		ShoppingCart cart = (ShoppingCart) model.getAttribute("ShoppingCart");
		
//		隨機產生memberId
		String memberId;
		
		memberId = String.valueOf((int)((Math.random() * 10000) + 1000));
//		產生日期
		String date = new SimpleDateFormat("yyyy/MM/dd HH:mm").format(new Date());
		// 新建訂單物件。OrderBean:封裝一筆訂單資料的容器，包含訂單主檔與訂單明細檔的資料。目前只存放訂單主檔的資料。
		OrderBean orderBean = new OrderBean(null,memberId,date,cart.getSubtotal(),0);
//		獲取存放購物車商品的map
		Map<String, OrderItemBean> cartcontent = cart.getContent();
		
		Set<OrderItemBean> items = new LinkedHashSet<>();
//		取出map所有的key，在下一步用key取出每個orderItem物件。
		Set<String> keys = cartcontent.keySet();
//		取出每個orderItem物件，set進訂單物件(建立關聯關係)。
		for (String key : keys) {
			OrderItemBean orderItemBean	= cartcontent.get(key);
			orderItemBean.setOrderBean(orderBean);
//		將每個orderItem物件加入Set
			items.add(orderItemBean);
		}
		System.out.println("here?");
//		 將所有商品物件set進訂單物件
			orderBean.setItems(items);
		try {
//			將訂單物件放到redirectAttributes內，重導至save方法新增進資料庫。
			redirectAttributes.addFlashAttribute("orderBean",orderBean);
			System.out.println("這裡還好嗎?");
		} catch (Exception e) {
			e.printStackTrace();
			return showCart(model);
		}	
//		重導至 OrderController.save();
		return "redirect:/save";
	}
	
	
	@GetMapping(value = "/save")
	public String processInsertOrder(@ModelAttribute("orderBean") OrderBean orderBean) throws Exception {
		
//		orderBean.setOrderDate(new SimpleDateFormat("yyyy/MM/dd HH:mm").format(Calendar.getInstance().getTime()));
		
//		if (orderBean.getOrderDate().isEmpty()) {
//			orderBean.setOrderDate(new SimpleDateFormat("yyyy/MM/dd HH:mm").format(new Date()));
//		}
//		System.out.println(orderBean.getOrderDate());
		System.out.println(orderBean);
		
		orderService.insertOrder(orderBean);
		
		return "redirect:/removeCart";
	}
	
	@GetMapping("/removeCart")
	public String removeCart(Model model,SessionStatus sessionStatus) {
//		清楚session裡的shoppingcart物件。
		sessionStatus.setComplete();
//		重導至 OrderBeanController.processAllQuery();
		return "redirect:/order/orderlist";
	}
}
