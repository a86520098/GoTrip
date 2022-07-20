package com.ispan.group3.repository;


import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.sql.Date;

//@Entity持久化映射到database,聲明book實體可以進行ORM映射

@Entity
@Table(name = "ticket")
public class Ticket {
	// 自動生成
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ticketNo")
	private Long ticketNo;
//	@Column(name="companyId")
//	private Long companyId;

	@Column(name = "ticketName")
	private String ticketName;

	@Column(name = "ticketIntro",length=5000)
	private String ticketIntro;

	@Column(name = "ticketOpenWeek")
	private String ticketOpenWeek;

	@Column(name = "ticketOpenTime")
	private String ticketOpenTime;

	@Column(name = "ticketEndTime")
	private String ticketEndTime;

	@Column(name = "phone")
	private String phone;

	@Column(name = "country")
	private String country;

	@Column(name = "city")
	private String city;

	@Column(name = "location")
	private String location;

	@Column(name = "address")
	private String address;

	@Column(name = "price")
	private int price;

	@Column(name = "tagNo")
	private String tagNo;

	@Column(name = "tagName")
	private String tagName;

	@Column(name="ticketStartDate")
	private Date ticketStartDate;

	@Column(name="ticketEndDate")
	private Date ticketEndDate;
	
	@Column(name="status")
	private Integer status = 0;
	
	@Column(name="ticketBriefIntro",length=5000)
	private String ticketBriefIntro;



	@OneToMany(mappedBy="ticket",cascade = CascadeType.ALL)
	private Set<TicketImage> images;
	
//	@OneToMany(mappedBy="ticket",cascade = CascadeType.ALL)
//	private List<TicketFronted> ticketfronted;
	
//	@OneToMany(mappedBy="ticket",cascade = CascadeType.ALL)
//	private Set<TicketPlan> plans;
	
//	@Column(name = "ticketImage")
//	private String ticketImage;
	
//	@OneToMany(mappedBy="ticket", fetch = FetchType.EAGER, cascade = CascadeType.ALL)

	public Long getTicketNo() {
		return ticketNo;
	}

	public Ticket() {
		super();
	}

	public void setTicketNo(Long ticketNo) {
		this.ticketNo = ticketNo;
	}

	public String getTicketName() {
		return ticketName;
	}

	public void setTicketName(String ticketName) {
		this.ticketName = ticketName;
	}

	public String getTicketIntro() {
		return ticketIntro;
	}

	public void setTicketIntro(String ticketIntro) {
		this.ticketIntro = ticketIntro;
	}

	public String getTicketOpenWeek() {
		return ticketOpenWeek;
	}

	public void setTicketOpenWeek(String ticketOpenWeek) {
		this.ticketOpenWeek = ticketOpenWeek;
	}

	public String getTicketOpenTime() {
		return ticketOpenTime;
	}

	public void setTicketOpenTime(String ticketOpenTime) {
		this.ticketOpenTime = ticketOpenTime;
	}

	public String getTicketEndTime() {
		return ticketEndTime;
	}

	public void setTicketEndTime(String ticketEndTime) {
		this.ticketEndTime = ticketEndTime;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getTagNo() {
		return tagNo;
	}

	public void setTagNo(String tagNo) {
		this.tagNo = tagNo;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public Date getTicketStartDate() {
		return ticketStartDate;
	}

	public void setTicketStartDate(Date ticketStartDate) {
		this.ticketStartDate = ticketStartDate;
	}

	public Date getTicketEndDate() {
		return ticketEndDate;
	}

	public void setTicketEndDate(Date ticketEndDate) {
		this.ticketEndDate = ticketEndDate;
	}

	
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getTicketBriefIntro() {
		return ticketBriefIntro;
	}

	public void setTicketBriefIntro(String ticketBriefIntro) {
		this.ticketBriefIntro = ticketBriefIntro;
	}
	

//	public Ticket(Long companyId, String ticketName, String ticketIntro, String ticketOpenWeek,
//			String ticketOpenTime, String ticketEndTime, String phone, String country, String city, String location,
//			String address, int price, String tagNo, String tagName, Date ticketStartDate, Date ticketEndDate,
//			Integer status, String ticketBriefIntro, Set<TicketImage> images, List<TicketFronted> ticketfronted) {
//		super();
//		this.companyId = companyId;
//		this.ticketName = ticketName;
//		this.ticketIntro = ticketIntro;
//		this.ticketOpenWeek = ticketOpenWeek;
//		this.ticketOpenTime = ticketOpenTime;
//		this.ticketEndTime = ticketEndTime;
//		this.phone = phone;
//		this.country = country;
//		this.city = city;
//		this.location = location;
//		this.address = address;
//		this.price = price;
//		this.tagNo = tagNo;
//		this.tagName = tagName;
//		this.ticketStartDate = ticketStartDate;
//		this.ticketEndDate = ticketEndDate;
//		this.status = status;
//		this.ticketBriefIntro = ticketBriefIntro;
//		this.images = images;
//	}


	//	Image相關
	 public Set<String> getImages() {
	 	Set<String> imagePaths = new LinkedHashSet<>();
	 	for (TicketImage image : images) {
	 		imagePaths.add(image.getImagePath());
	 	}
	 	return imagePaths;
	 }

	 public void setImages(Set<TicketImage> images) {
	 	this.images = images;
	 }

	 public Ticket(Long ticketNo, String ticketName, String ticketIntro, String ticketOpenWeek,
	 		String ticketOpenTime, String ticketEndTime, String phone, String country, String city, String location,
	 		String address, int price , Set<TicketImage> images, Integer status,String ticketBriefIntro) {
	 	super();
	 	this.ticketNo = ticketNo;
	 	this.ticketName = ticketName;
	 	this.ticketIntro = ticketIntro;
	 	this.ticketOpenWeek = ticketOpenWeek;
	 	this.ticketOpenTime = ticketOpenTime;
	 	this.ticketEndTime = ticketEndTime;
	 	this.phone = phone;
	 	this.country = country;
	 	this.city = city;
	 	this.location = location;
	 	this.address = address;
	 	this.price = price;
	 	this.images = images;
	 	this.status = status;
	 	this.ticketBriefIntro = ticketBriefIntro;
//	 	this.companyId = companyId;
	 }

	 public Ticket(String ticketName, String ticketIntro, String ticketOpenWeek, String ticketOpenTime,
	 		String ticketEndTime, String phone, String country, String city, String location, String address, int price
	 		,Set<TicketImage> images, Integer status,String ticketBriefIntro) {
	 	super();
	 	this.ticketName = ticketName;
	 	this.ticketIntro = ticketIntro;
	 	this.ticketOpenWeek = ticketOpenWeek;
	 	this.ticketOpenTime = ticketOpenTime;
	 	this.ticketEndTime = ticketEndTime;
	 	this.phone = phone;
	 	this.country = country;
	 	this.city = city;
	 	this.location = location;
	 	this.address = address;
	 	this.price = price;
	 	this.images = images;
	 	this.status = status;
	 	this.ticketBriefIntro = ticketBriefIntro;
//	 	this.companyId = companyId;
	 }
}

//Image相關
//public String getTicketImage() {
//	return ticketImage;
//}
//
//public void setTicketImage(String ticketImage) {
//	this.ticketImage = ticketImage;
//}
