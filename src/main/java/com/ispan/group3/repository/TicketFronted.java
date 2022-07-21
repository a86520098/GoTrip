//package com.ispan.group3.repository;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//
//@Entity
//@Table(name = "Ticket_fronted")	
//public class TicketFronted {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "id")
//	private long id;
//	
//	@Column(name = "name")
//	private String Name;
//	
//	@Column(name = "introduction")
//	private String introduction;
//	
//	@Column(name = "phone")
//	private String phone;
//
//	@Column(name = "country")
//	private String country;
//
//	@Column(name = "city")
//	private String city;
//
//	@Column(name = "location")
//	private String location;
//
//	@Column(name = "address")
//	private String address;
//
//	@Column(name = "price")
//	private int price;
//
//	@Column(name = "tagNo")
//	private String tagNo;
//
//	@Column(name = "tagName")
//	private String tagName;
//	
//	 @ManyToOne
//	 @JoinColumn(name = "ticket_no3")
//	 private Ticket ticket;
//
//	 
//	 public TicketFronted() {
//	 }
//	 
//	public TicketFronted(long id, String name, String introduction, String phone, String country, String city,
//			String location, String address, int price, String tagNo, String tagName, Ticket ticket) {
//		super();
//		this.id = id;
//		Name = name;
//		this.introduction = introduction;
//		this.phone = phone;
//		this.country = country;
//		this.city = city;
//		this.location = location;
//		this.address = address;
//		this.price = price;
//		this.tagNo = tagNo;
//		this.tagName = tagName;
//		this.ticket = ticket;
//	}
//
//	public TicketFronted(String introduction, String phone, String country, String city, String location,
//			String address, int price, String tagNo, String tagName, Ticket ticket) {
//		super();
//		this.introduction = introduction;
//		this.phone = phone;
//		this.country = country;
//		this.city = city;
//		this.location = location;
//		this.address = address;
//		this.price = price;
//		this.tagNo = tagNo;
//		this.tagName = tagName;
//		this.ticket = ticket;
//	}
//
//	public long getId() {
//		return id;
//	}
//
//	public void setId(long id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return Name;
//	}
//
//	public void setName(String name) {
//		Name = name;
//	}
//
//	public String getIntroduction() {
//		return introduction;
//	}
//
//	public void setIntroduction(String introduction) {
//		this.introduction = introduction;
//	}
//
//	public String getPhone() {
//		return phone;
//	}
//
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}
//
//	public String getCountry() {
//		return country;
//	}
//
//	public void setCountry(String country) {
//		this.country = country;
//	}
//
//	public String getCity() {
//		return city;
//	}
//
//	public void setCity(String city) {
//		this.city = city;
//	}
//
//	public String getLocation() {
//		return location;
//	}
//
//	public void setLocation(String location) {
//		this.location = location;
//	}
//
//	public String getAddress() {
//		return address;
//	}
//
//	public void setAddress(String address) {
//		this.address = address;
//	}
//
//	public int getPrice() {
//		return price;
//	}
//
//	public void setPrice(int price) {
//		this.price = price;
//	}
//
//	public String getTagNo() {
//		return tagNo;
//	}
//
//	public void setTagNo(String tagNo) {
//		this.tagNo = tagNo;
//	}
//
//	public String getTagName() {
//		return tagName;
//	}
//
//	public void setTagName(String tagName) {
//		this.tagName = tagName;
//	}
//
//	public Ticket getTicket() {
//		return ticket;
//	}
//
//	public void setTicket(Ticket ticket) {
//		this.ticket = ticket;
//	}
//	
//	@Override
//	public String toString() {
//		return "TicketFronted [id=" + id + 
//				", name=" + Name + 
//				", Introduction=" + introduction + 
//				", phone=" + phone + 
//				", country=" + country + 
//				", city=" + city + 
//				", location=" + location + 
//				", address=" + address + 
//				", price=" + price + 
//				", tagNo=" + tagNo + 
//				", tagName=" + tagName + 
//				", Ticket=" + ticket + 
//				"]";
//	}
//}
