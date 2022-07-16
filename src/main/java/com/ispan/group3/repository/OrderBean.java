package com.ispan.group3.repository;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class OrderBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer orderNo;
	String memberId;
//	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	String orderDate;
	Integer totalPrice;
	Integer status;

	@OneToMany(mappedBy = "orderBean", cascade = CascadeType.ALL)
	Set<OrderItemBean> items = new LinkedHashSet<>();




	public OrderBean() {

	}

	public OrderBean(Integer orderNo, String memberId, String orderDate, Integer totalPrice, Integer status) {
		super();
		this.orderNo = orderNo;
		this.memberId = memberId;
		this.orderDate = orderDate;
		this.totalPrice = totalPrice;
		this.status = status;
	}

	
	
	public Integer getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public Integer getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public Set<OrderItemBean> getItems() {
		return items;
	}

	public void setItems(Set<OrderItemBean> items) {
		this.items = items;
	}

}
