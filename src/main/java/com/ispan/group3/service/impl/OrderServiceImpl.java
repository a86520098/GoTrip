package com.ispan.group3.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ispan.group3.repository.OrderBean;
import com.ispan.group3.repository.OrderRepository;
import com.ispan.group3.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private	OrderRepository orderRepository;
	
	@Override
	public List<OrderBean> findAllOrder() {
		
		return orderRepository.findAll();
	}

	@Override
	public OrderBean findSingleOrder(Integer orderNo) {
		OrderBean orderBean = orderRepository.findById(orderNo).get();
		return orderBean;
	}


	@Override
	public void deleteOrder(Integer orderNo) {
		orderRepository.deleteById(orderNo);
	}

	@Override
	public void insertOrder(OrderBean orderBean) {
		orderRepository.save(orderBean);	
	}

	@Override
	public List<OrderBean> findBymemberId(String memberId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateOrderStatus(Integer status, Integer orderId) {
		orderRepository.updateByStatus(status, orderId);
		
	}

}
