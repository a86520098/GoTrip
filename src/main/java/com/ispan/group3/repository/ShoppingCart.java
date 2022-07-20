package com.ispan.group3.repository;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

//@Component
//@Scope("session")
public class ShoppingCart {   
	
	private Map<String, OrderItemBean> cart = new LinkedHashMap<>();
	
	public ShoppingCart() {
	}
	
	public Map<String, OrderItemBean>  getContent() { // ${ShoppingCart.content}
		return cart;
	}
	public void addToCart(String oId,OrderItemBean  oib) {
		
		
		if (oib.getQuantity() <= 0 ) {
			return;
		}
		// 如果客戶在伺服器端沒有此項商品的資料，則客戶第一次購買此項商品
		if ( cart.get(oId) == null ) {
		    cart.put(oId, oib);
		} else {
	        
			OrderItemBean oiBean = cart.get(oId);
			// 加購的數量：bean.getQuantity()
			// 原有的數量：oBean.getQuantity()			
			oiBean.setQuantity(oib.getQuantity() + oiBean.getQuantity());
		}
	}

	public boolean updateItem(String oid, int newQty) {
		if ( cart.get(oid) != null ) {
		   OrderItemBean  bean = cart.get(oid);
		   bean.setQuantity(newQty);
	       return true;
		} else {
		   return false;
		}
	}
	// 刪除某項商品
	public int deleteItem(String productId) {
		if ( cart.get(productId) != null ) {
	       cart.remove(productId);  // Map介面的remove()方法
	       return 1;
		} else {
		   return 0;
		}
	}
	public int getItemNumber(){   // ShoppingCart.itemNumber
		return cart.size();
	}
	//計算購物車內所有商品的合計金額(每項商品的單價*數量的總和)
	public int getSubtotal(){
		int subTotal = 0 ;
		Set<String> set = cart.keySet();
		for(String n : set){
			OrderItemBean oib = cart.get(n);
			double price    = oib.getUnitPrice();
			int qty      = oib.getQuantity();
			subTotal +=  price * qty;
		}
		return subTotal;
	}
}
