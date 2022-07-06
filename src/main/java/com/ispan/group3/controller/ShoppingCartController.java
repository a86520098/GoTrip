package com.ispan.group3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ispan.group3.repository.Hotel;
import com.ispan.group3.repository.OrderItemBean;
import com.ispan.group3.repository.ShoppingCart;
import com.ispan.group3.service.HotelService;

@Controller
@SessionAttributes({"ShoppingCart"})
public class ShoppingCartController {
	
	private HotelService hotelService;
	
	@Autowired
	public ShoppingCartController(HotelService hotelService) {
		this.hotelService = hotelService;
	}

	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	@PostMapping("/addToCart")
	public void addToCart(Model model,
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
				Hotel hotelBean = hotelService.findById(productId);	
//				 將訂單資料(價格，數量，折扣與BookBean)封裝到OrderItemBean物件內
//				OrderItemBean oib = new OrderItemBean(productId, hotelBean.getHotel_name(), 
//							hotelBean.getPrice(), qty,hotelBean.getPhone()); 
//				 將OrderItem物件內加入ShoppingCart的物件內
//				cart.addToCart(productId, oib);
//				
	}
}
