package com.ispan.group3.repository;


import java.util.LinkedHashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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

	@Column(name = "ticketName")
	private String ticketName;

	@Column(name = "ticketIntro")
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
	
	@OneToMany(mappedBy="ticket",cascade = {CascadeType.PERSIST,CascadeType.REMOVE}, fetch = FetchType.EAGER)
	private Set<TicketImage> images;

//	@Column(name = "ticketImage")
//	private String ticketImage;
	
//	@OneToMany(mappedBy="ticket", fetch = FetchType.EAGER, cascade = CascadeType.ALL)

	public Long getTicketNo() {
		return ticketNo;
	}

	public Ticket() {
		super();
	}

	//Image相關
//	public String getTicketImage() {
//		return ticketImage;
//	}
//
//	public void setTicketImage(String ticketImage) {
//		this.ticketImage = ticketImage;
//	}

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

	public Ticket(long ticketNo, String ticketName, String ticketIntro, String ticketOpenWeek,
			String ticketOpenTime, String ticketEndTime, String phone, String country, String city, String location,
			String address, int price, String tagNo, String tagName, Date ticketStartDate, Date ticketEndDate) {
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
		this.tagNo = tagNo;
		this.tagName = tagName;
		this.ticketStartDate = ticketStartDate;
		this.ticketEndDate = ticketEndDate;
	}

	public Ticket(String ticketName, String ticketIntro, String ticketOpenWeek, String ticketOpenTime,
			String ticketEndTime, String phone, String country, String city, String location, String address, int price,
			String tagNo, String tagName, Date ticketStartDate, Date ticketEndDate) {
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
		this.tagNo = tagNo;
		this.tagName = tagName;
		this.ticketStartDate = ticketStartDate;
		this.ticketEndDate = ticketEndDate;
	}

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
	 		String address, int price , Set<TicketImage> images) {
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
	 }

	 public Ticket(String ticketName, String ticketIntro, String ticketOpenWeek, String ticketOpenTime,
	 		String ticketEndTime, String phone, String country, String city, String location, String address, int price
	 		,Set<TicketImage> images) {
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
	 }
}
