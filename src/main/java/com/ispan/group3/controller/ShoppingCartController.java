package com.ispan.group3.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.security.PermitAll;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ispan.group3.repository.CarOption;
import com.ispan.group3.repository.Hotel;
import com.ispan.group3.repository.OrderBean;
import com.ispan.group3.repository.OrderItemBean;
import com.ispan.group3.repository.ShoppingCart;
import com.ispan.group3.repository.Ticket;
import com.ispan.group3.repository.UserData;
import com.ispan.group3.repository.UserDetailsData;
import com.ispan.group3.service.CarOptionService;
import com.ispan.group3.service.HotelService;
import com.ispan.group3.service.OrderService;
import com.ispan.group3.service.TicketService;
import com.ispan.group3.service.UserService;

import ecpay.payment.integration.AllInOne;
import ecpay.payment.integration.domain.AioCheckOutDevide;

@Controller
@SessionAttributes({"ShoppingCart"})
public class ShoppingCartController {
	
	private HotelService hotelService;
	
	private TicketService ticketService;
	
	private CarOptionService carOptionService;
	
	private OrderService orderService;
	
	private UserService userService;
	
	@Autowired	
	public ShoppingCartController(HotelService hotelService, TicketService ticketService,
			CarOptionService carOptionService, OrderService orderService, UserService userService) {
		super();
		this.hotelService = hotelService;
		this.ticketService = ticketService;
		this.carOptionService = carOptionService;
		this.orderService = orderService;
		this.userService = userService;
	}

	@GetMapping("showCartItems")
	@ResponseBody
	public int showCartItems(Model model) {
		
		int itemNumber = 0;
		ShoppingCart cart = (ShoppingCart) model.getAttribute("ShoppingCart");
		if(cart != null) {
			
			itemNumber = cart.getItemNumber(); 
		}
		
		
		return itemNumber;
	}
	
//	@ResponseStatus(value = HttpStatus.NO_CONTENT) ??????204 
	@GetMapping("/addToCart")
	@ResponseBody
	public ShoppingCart addToCart(Model model,@RequestParam(value = "productId",required = false) Integer productId,
				@RequestParam(value = "qty",required = false) Integer qty,
					@RequestParam(value = "type",required = false) String type,
						@RequestParam(value = "date",required = false) String goDate) {
		
		System.out.println("????????????go?" + goDate);
		// ???????????????session????????????ShoppingCart??????
				ShoppingCart cart = (ShoppingCart) model.getAttribute("ShoppingCart");
				
				
				// ???????????????ShoppingCart??????
				if (cart == null) {
					// ?????????ShoppingCart??????
					cart = new ShoppingCart();
					// ???????????????ShoppingCart???????????????session????????????????????????????????????
					model.addAttribute("ShoppingCart", cart);   
				}
//				???????????????????????????
				OrderItemBean oib;

				String oId = null;
				switch (type) {
				case "hotel":
					Hotel hotelBean = hotelService.findById(productId);	
//				 ???????????????(???????????????????????????BookBean)?????????OrderItemBean?????????
					
								
					 oib = new OrderItemBean(productId,goDate,type,hotelBean.getHotel_name(), 
							hotelBean.getPrice(), qty,String.valueOf(hotelBean.getPhone())); 

//					 ??????????????????????????????key
					 	oId	= "h" + String.valueOf(productId);
					 	
//				 ???OrderItem??????.???????????????key?????????ShoppingCart????????????
					 	cart.addToCart(oId,oib);
					break;
				case "ticket":
					Ticket ticket = ticketService.findById(productId).get();
					System.out.println("??????:" + ticket.getPhone());
//					 ???????????????(???????????????????????????BookBean)?????????OrderItemBean?????????
					 oib = new OrderItemBean(productId,goDate,type,ticket.getTicketName(),
							 ticket.getPrice(),qty,ticket.getPhone()); 
					 
//					 ??????????????????????????????key
					 oId = "t" + String.valueOf(productId);
					 
//					 ???OrderItem??????.???????????????key?????????ShoppingCart????????????
						cart.addToCart(oId,oib);
						
					break;
				case "car":	
					CarOption car= carOptionService.findById(productId);
//					 ???????????????(???????????????????????????BookBean)?????????OrderItemBean?????????
					String carInfo = car.getCarLocation().getCompanyName() + "(" + car.getCarModel().getMakeEn() + ")";
					System.out.println(carInfo);
					 oib = new OrderItemBean(productId,goDate,type,carInfo,
							car.getPriceSale(),qty,car.getCarLocation().getPhone()); 
					 
//					 ??????????????????????????????key
					oId = "c" + String.valueOf(productId);
					
//					 ???OrderItem??????.???????????????key??????ShoppingCart????????????
						cart.addToCart(oId,oib);
					break;	
				default:
					break;
				}
				
				

				return cart;
	}
	//	???????????????
	@GetMapping("/showCart")
	public String showCart(Model model) {
		
		// ???????????????session????????????ShoppingCart??????
		ShoppingCart cart = (ShoppingCart) model.getAttribute("ShoppingCart");
		
		
		// ???????????????ShoppingCart??????
		if (cart == null) {
			// ?????????ShoppingCart??????
			cart = new ShoppingCart();
			// ???????????????ShoppingCart???????????????session????????????????????????????????????
			model.addAttribute("ShoppingCart", cart);   
		}
		
		return "frontend/shopingcart";
	}
	@ResponseBody
	@GetMapping("/deleteItem")
	public ShoppingCart deleteItem(Model model,@RequestParam String productKey) {
		
		ShoppingCart cart = (ShoppingCart) model.getAttribute("ShoppingCart");
		
		cart.deleteItem(productKey);
		System.out.println("????????????");
		return cart;
	}
	@ResponseBody
	@GetMapping("/updateItem")
	public ShoppingCart updateItem(Model model,@RequestParam(required = false) String productKey,
			@RequestParam(required = false) Integer itemNumber) {
		
		ShoppingCart cart = (ShoppingCart) model.getAttribute("ShoppingCart");
		
		cart.updateItem(productKey, itemNumber);
		System.out.println("????????????");
		return cart;
	}
	
	@ResponseBody
	@GetMapping("/lastItemNumber")
	public int lastItemNumber(Model model,@RequestParam(required = false) String productKey) {
		
		ShoppingCart cart = (ShoppingCart) model.getAttribute("ShoppingCart");
		
		System.out.println("???????????????????????????????");
		
		int lastItemNumber  = cart.lastItemNumber(productKey);
		
		return lastItemNumber;		
				
	}
	
	@GetMapping("/creatOrder")
	public String creatOrder(@RequestParam(value = "payStatus",required = false) Integer payStatus, Model model,RedirectAttributes redirectAttributes,
			@AuthenticationPrincipal UserDetailsData loggedUser,HttpSession session) {
		
		ShoppingCart cart = (ShoppingCart) model.getAttribute("ShoppingCart");
		
		
//		???Security??????memberId
		UserData user = userService.findByUsername(loggedUser.getUsername());
		int memberId = user.getUser_id();
		System.out.println("??????id???:"+ memberId);

//		????????????
		String date = new SimpleDateFormat("yyyy/MM/dd HH:mm").format(new Date());
		// ?????????????????????OrderBean:???????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
		OrderBean orderBean = new OrderBean(null,memberId,date,cart.getSubtotal(),0);
//		??????????????????????????????map
		Map<String, OrderItemBean> cartcontent = cart.getContent();
		
		Set<OrderItemBean> items = new LinkedHashSet<>();
//		??????map?????????key??????????????????key????????????orderItem?????????
		Set<String> keys = cartcontent.keySet();
//		????????????orderItem?????????set???????????????(??????????????????)???
		for (String key : keys) {
			OrderItemBean orderItemBean	= cartcontent.get(key);
			orderItemBean.setOrderBean(orderBean);
//		?????????orderItem????????????Set
			items.add(orderItemBean);
		}
		System.out.println("here?");
//		 ?????????????????????set???????????????
			orderBean.setItems(items);
		try {
//			?????????????????????redirectAttributes???????????????save???????????????????????????
			redirectAttributes.addFlashAttribute("orderBean",orderBean);
			session.setAttribute("orderBean", orderBean);
			System.out.println("????????????????");
		} catch (Exception e) {
			e.printStackTrace();
			return showCart(model);
		}	
//		????????? OrderController.save();
		System.out.println("payStatus is:" + payStatus);
		return "redirect:/order/save/" + payStatus;
	}
	
	
	@GetMapping("/order/save/{payStatus}")
	public String processInsertOrder(@PathVariable("payStatus") Integer payStatus,@ModelAttribute("orderBean") OrderBean orderBean) throws Exception {
		
//		orderBean.setOrderDate(new SimpleDateFormat("yyyy/MM/dd HH:mm").format(Calendar.getInstance().getTime()));
		
//		if (orderBean.getOrderDate().isEmpty()) {
//			orderBean.setOrderDate(new SimpleDateFormat("yyyy/MM/dd HH:mm").format(new Date()));
//		}
//		System.out.println(orderBean.getOrderDate());
		System.out.println(orderBean);
		
		orderService.insertOrder(orderBean);
		
		return "redirect:/removeCart/" +  payStatus;
	}
	
	@GetMapping("/removeCart/{payStatus}")
	public String removeCart(@PathVariable("payStatus") Integer payStatus,Model model,SessionStatus sessionStatus) {
//		??????session??????shoppingcart?????????
		sessionStatus.setComplete();
//		webRequest.removeAttribute("ShoppingCart", WebRequest.SCOPE_SESSION);
//		????????? OrderBeanController.processAllQuery();
//		?????????????????? ?????????????????????>????????????
			if (payStatus == 0) {
				return "redirect:/order/client/orderlist"; 
			}		
				return "redirect:/goECPay";

	}
	
	@ResponseBody
	@GetMapping({"/goECPay","/goECPay/{orderId}"})
	public String goECPay(@PathVariable(required = false) Integer orderId,Model model,HttpServletRequest request,
				HttpServletResponse response,HttpSession session) throws IOException {
		
			 OrderBean orderBean;
			 orderBean = (OrderBean) session.getAttribute("orderBean");
			 if (orderBean == null) {
				orderBean = orderService.findSingleOrder(orderId);
			}
			 
			String orderNo = getAlphaNumericString(17) + orderBean.getOrderNo();
			System.out.println(orderNo);
			
//		????????????    
		AllInOne aio = new AllInOne("");
		AioCheckOutDevide aioCheck = new AioCheckOutDevide();
//		????????????
		aioCheck.setMerchantID("2000214");
//		??????????????????
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		simpleDateFormat.setLenient(false);
		aioCheck.setMerchantTradeDate(simpleDateFormat.format(new Date()));
//		????????????
		aioCheck.setTotalAmount(orderBean.getTotalPrice().toString());
//		????????????
		aioCheck.setTradeDesc("justForTest");
//		????????????
		aioCheck.setItemName("GoTrip????????????");
//		??????????????????
		aioCheck.setMerchantTradeNo(orderNo);
//		????????????????????????
		aioCheck.setReturnURL("http://localhost:8080/gotrip/returnURL");
//		Client???????????????
//		 ????????? spring security?????? ????????????  ????????????url
//		aioCheck.setClientBackURL("http://localhost:8080/gotrip/order/orderlist");
		aioCheck.setClientBackURL("http://localhost:8080/gotrip/showUserOrder/" + orderBean.getOrderNo());
		
		aioCheck.setNeedExtraPaidInfo("N");
//		????????????
//		PrintWriter out = response.getWriter();
//		response.setContentType("text/html");
//		out.print(aio.aioCheckOut(aioCheck, null));
		String form = aio.aioCheckOut(aioCheck, null);
		return form;
	}
	
	@GetMapping("/showUserOrder/{orderId}")
	public String showUserOrder (@PathVariable("orderId") Integer orderId,Model model,
				HttpServletRequest request,HttpSession session) {
			
			orderService.updateOrderStatus(1, orderId);
//			??????????????? ??????session??? order??????
			session.removeAttribute("orderBean");		
			
			return "redirect:/order/client/orderlist";

	}
	
	
	@PermitAll
	@GetMapping("/returnURL")
	public void returnURL(@RequestParam("MerchantTradeNo") String MerchantTradeNo,
			@RequestParam("RtnCode") int RtnCode,@RequestParam("TradeAmt") int TradeAmt,
			 HttpServletRequest request,HttpSession session) {
//		
//		if ((request.getRemoteAddr().equalsIgnoreCase("175.99.72.1")
//				|| request.getRemoteAddr().equalsIgnoreCase("175.99.72.11")
//				|| request.getRemoteAddr().equalsIgnoreCase("175.99.72.24")
//				|| request.getRemoteAddr().equalsIgnoreCase("175.99.72.28")
//				|| request.getRemoteAddr().equalsIgnoreCase("175.99.72.32")) && RtnCode == 1 ) {
			String orderIdStr =	 MerchantTradeNo.substring(17);
			System.out.println(orderIdStr);
			int orderId = Integer.parseInt(orderIdStr);
			System.out.println("???????????????" + orderIdStr);
			orderService.updateOrderStatus(1, orderId);
			
			session.removeAttribute("orderBean");
//		}

	}

//	????????????????????????
	static String getAlphaNumericString(int n)
    {
  
        // chose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz";
  
        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);
  
        for (int i = 0; i < n; i++) {
  
            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                = (int)(AlphaNumericString.length()
                        * Math.random());
  
            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                          .charAt(index));
        }
  
        return sb.toString();
    }
	
}
