package com.ispan.group3.repository;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "OrderItems")
public class OrderItemBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private	Integer itemNo;
	private Integer productId;
	private	String goDate;
	private String type;
	private String itemInfo;
	private Integer unitPrice;
	private	Integer quantity;
	@JsonIgnore
	private String phone;	
	@JsonIgnore
	private Blob photo;

	@ManyToOne
	@JoinColumn(name = "orderNo")
	@JsonIgnore
	OrderBean orderBean;


	public OrderItemBean() {
		super();
	}

	public OrderItemBean(Integer productId,String goDate,String type,String itemInfo, Integer unitPrice, Integer quantity, String phone) {
		super();
		this.productId = productId;
		this.goDate = goDate;
		this.itemInfo = itemInfo;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		this.phone = phone;
		this.type = type;
		
	}
	
	
	public String getGoDate() {
		return goDate;
	}

	public void setGoDate(String goDate) {
		this.goDate = goDate;
	}

	public Blob getPhoto() {
		return photo;
	}

	public void setPhoto(Blob photo) {
		this.photo = photo;
	}
	
	public Integer getItemNo() {
		return itemNo;
	}

	public void setItemNo(Integer itemNo) {
		this.itemNo = itemNo;
	}

	public String getItemInfo() {
		return itemInfo;
	}

	public void setItemInfo(String itemInfo) {
		this.itemInfo = itemInfo;
	}

	public Integer getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	public OrderBean getOrderBean() {
		return orderBean;
	}

	public void setOrderBean(OrderBean orderBean) {
		this.orderBean = orderBean;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
