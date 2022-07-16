package com.ispan.group3.repository;


import java.sql.Blob;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Getter
@Setter
@Entity
@Table(name = "Hotel")
@Component("Hotel")
public class Hotel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;  //自動生成
	private String  status;  //是專業經理 Or 自由業者
	private String  hotelStyle;   // 公寓 & 整間小屋  & 整棟住宅 & 別墅 & 專業大飯店
	private Integer hotelArea;  // 接受使用者  住宿大小坪數
	private Integer bathCount;  // 衛浴數量
	private Integer bedroomCount;  //房間數量
	private Integer bedCount;   //床的數量
	private String  fullAddress;  //完整地址
	private String  notional;  //國家
	private String  city;   //城市
	private String  hotelRule;  //住宿規則
	private String  Howgoto;   //顧客該如何去
	private String  hotel_name;  // 住宿的Name
	private String  introduce;   //介紹你的hotel
	private String  provide;    // checkbox 多值
	private Integer phone;     //聯絡的電話
	private Integer price;     ////一晚的價格
	private String  boss_name;   //聯絡人名子
	private String  roomtype;    //單人房  Or  雙人房 or Both
	private Integer peopleCount;  //可住人數
	@JsonIgnore
	private  Blob image;   //之後接受照片的容器
	private  String fileName; //接檔案名稱
	@CreationTimestamp
	private  Timestamp admissionTime; //街道檔案的那時候時間
	@Transient
	@JsonIgnore
	private  MultipartFile productImage;//前端照片
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getHotelStyle() {
		return hotelStyle;
	}
	public void setHotelStyle(String hotelStyle) {
		this.hotelStyle = hotelStyle;
	}
	public Integer getHotelArea() {
		return hotelArea;
	}
	public void setHotelArea(Integer hotelArea) {
		this.hotelArea = hotelArea;
	}
	public Integer getBathCount() {
		return bathCount;
	}
	public void setBathCount(Integer bathCount) {
		this.bathCount = bathCount;
	}
	public Integer getBedroomCount() {
		return bedroomCount;
	}
	public void setBedroomCount(Integer bedroomCount) {
		this.bedroomCount = bedroomCount;
	}
	public Integer getBedCount() {
		return bedCount;
	}
	public void setBedCount(Integer bedCount) {
		this.bedCount = bedCount;
	}
	public String getFullAddress() {
		return fullAddress;
	}
	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}
	public String getNotional() {
		return notional;
	}
	public void setNotional(String notional) {
		this.notional = notional;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getHotelRule() {
		return hotelRule;
	}
	public void setHotelRule(String hotelRule) {
		this.hotelRule = hotelRule;
	}
	public String getHowgoto() {
		return Howgoto;
	}
	public void setHowgoto(String howgoto) {
		Howgoto = howgoto;
	}
	public String getHotel_name() {
		return hotel_name;
	}
	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public String getProvide() {
		return provide;
	}
	public void setProvide(String provide) {
		this.provide = provide;
	}
	public Integer getPhone() {
		return phone;
	}
	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getBoss_name() {
		return boss_name;
	}
	public void setBoss_name(String boss_name) {
		this.boss_name = boss_name;
	}
	public String getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}
	public Integer getPeopleCount() {
		return peopleCount;
	}
	public void setPeopleCount(Integer peopleCount) {
		this.peopleCount = peopleCount;
	}
	public Blob getImage() {
		return image;
	}
	public void setImage(Blob image) {
		this.image = image;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public Timestamp getAdmissionTime() {
		return admissionTime;
	}
	public void setAdmissionTime(Timestamp admissionTime) {
		this.admissionTime = admissionTime;
	}
	public MultipartFile getProductImage() {
		return productImage;
	}
	public void setProductImage(MultipartFile productImage) {
		this.productImage = productImage;
	}




}