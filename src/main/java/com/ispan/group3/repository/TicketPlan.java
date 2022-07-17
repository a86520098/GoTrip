//package com.ispan.group3.repository;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "Ticket_plan")
//public class TicketPlan {
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name = "ticketPlanNo")
//	private Long ticketPlanNo;
//	
//	@Column(name = "ticketPlanName")
//	private String ticketPlanName;
//	
//	@Column(name = "ticketPlanIntro")
//	private String ticketPlanIntro;
//	
//	
//	@Column(name = "ticketPlanType")
//	private int ticketPlanType;
//	
//	@Column(name = "ticketPlanTypeName")
//	private String ticketPlanTypeName;
//
//	
//	@Column(name = "ticketPlanPrice")
//	private int ticketPlanPrice;
//	
//	@ManyToOne
//	@JoinColumn(name = "ticket_no2")
//	private Ticket ticket;
//		
//	public Long getTicketPlanNo() {
//		return ticketPlanNo;
//	}
//
//	public void setTicketPlanNo(Long ticketPlanNo) {
//		this.ticketPlanNo = ticketPlanNo;
//	}
//
//	public String getTicketPlanName() {
//		return ticketPlanName;
//	}
//
//	public void setTicketPlanName(String ticketPlanName) {
//		this.ticketPlanName = ticketPlanName;
//	}
//
//	public String getTicketPlanIntro() {
//		return ticketPlanIntro;
//	}
//
//	public void setTicketPlanIntro(String ticketPlanIntro) {
//		this.ticketPlanIntro = ticketPlanIntro;
//	}
//
//	public int getTicketPlanType() {
//		return ticketPlanType;
//	}
//
//	public void setTicketPlanType(int ticketPlanType) {
//		this.ticketPlanType = ticketPlanType;
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
//	public String getTicketPlanTypeName() {
//		return ticketPlanTypeName;
//	}
//
//	public void setTicketPlanTypeName(String ticketPlanTypeName) {
//		this.ticketPlanTypeName = ticketPlanTypeName;
//	}
//
//	public int getTicketPlanPrice() {
//		return ticketPlanPrice;
//	}
//
//	public void setTicketPlanPrice(int ticketPlanPrice) {
//		this.ticketPlanPrice = ticketPlanPrice;
//	}
//
//	public TicketPlan(String ticketPlanName, String ticketPlanIntro, int ticketPlanType, int ticketPlanPrice, String ticketPlanTypeName,
//			Ticket ticket) {
//		super();
//		this.ticketPlanName = ticketPlanName;
//		this.ticketPlanIntro = ticketPlanIntro;
//		this.ticketPlanPrice = ticketPlanPrice;
//		this.ticketPlanType = ticketPlanType;
//		this.ticketPlanTypeName = ticketPlanTypeName;
//		this.ticket = ticket;
//	}
//
//	public TicketPlan(Long ticketPlanNo, String ticketPlanName, String ticketPlanIntro, int ticketPlanPrice, String ticketPlanTypeName,
//			int ticketPlanType, Ticket ticket) {
//		super();
//		this.ticketPlanNo = ticketPlanNo;
//		this.ticketPlanName = ticketPlanName;
//		this.ticketPlanIntro = ticketPlanIntro;
//		this.ticketPlanPrice = ticketPlanPrice;
//		this.ticketPlanType = ticketPlanType;
//		this.ticketPlanTypeName = ticketPlanTypeName;
//		this.ticket = ticket;
//	}
//
//	@Override
//	public String toString() {
//		return "TicketPlan [ticketPlanNo=" + ticketPlanNo + 
//				", ticketPlanName=" + ticketPlanName + 
//				", ticketPlanIntro=" + ticketPlanIntro + 
//				", ticketPlanPrice=" + ticketPlanPrice + 
//				", ticketPlanType=" + ticketPlanType + 
//				", ticketPlanTypeName=" + ticketPlanTypeName + 
//				", Ticket=" + ticket + 
//				"]";
//	}
//}
