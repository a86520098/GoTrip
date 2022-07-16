package com.ispan.group3.service;

import java.util.List;

import com.ispan.group3.repository.OrderBean;

public interface OrderService {
	
	List<OrderBean> findAllOrder();
	
	OrderBean findSingleOrder(Integer orderNo);
	
	void deleteOrder(Integer orderNo);
	
	void insertOrder(OrderBean orderBean);
//	透過memberId查詢
	List<OrderBean> findBymemberId(String memberId);
//	更改訂單狀態
	void updateOrderStatus(Integer status,Integer orderId);
	
	
	
	
}
