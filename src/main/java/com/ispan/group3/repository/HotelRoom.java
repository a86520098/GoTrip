package com.ispan.group3.repository;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = " HotelRoom")
@Component("HotelRoom")
public class HotelRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String roomname;
    private Integer roomprice;
    private Integer bathCount;  // 衛浴數量
    private Integer bedroomCount;  //房間數量
    private Integer bedCount;   //床的數量
    private Integer hotelArea;  // 接受使用者  住宿大小坪數
    @Column(length = 2000)
    private String roomRule;  //住宿規則
    @Column(length = 2000)
    private String roomIntroduce;   //介紹你的hotel
    private String provide;    // checkbox 多值
    private Integer peopleCount;  //可住人數
    private String feature1;// 特色1
    private String feature2;// 特色1
    private String feature3;// 特色1
    private String roomtype;    //單人房  Or  雙人房 or Both

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hotel_id")
    @JsonIgnore
    private Hotel hotel;


    @OneToMany(mappedBy = "hotelRoom", cascade = CascadeType.ALL)
    private List<HotelRoomImage> hotelRoomImageList;


    public HotelRoom() {
    }


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getRoomname() {
		return roomname;
	}


	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}


	public Integer getRoomprice() {
		return roomprice;
	}


	public void setRoomprice(Integer roomprice) {
		this.roomprice = roomprice;
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


	public Integer getHotelArea() {
		return hotelArea;
	}


	public void setHotelArea(Integer hotelArea) {
		this.hotelArea = hotelArea;
	}


	public String getRoomRule() {
		return roomRule;
	}


	public void setRoomRule(String roomRule) {
		this.roomRule = roomRule;
	}


	public String getRoomIntroduce() {
		return roomIntroduce;
	}


	public void setRoomIntroduce(String roomIntroduce) {
		this.roomIntroduce = roomIntroduce;
	}


	public String getProvide() {
		return provide;
	}


	public void setProvide(String provide) {
		this.provide = provide;
	}


	public Integer getPeopleCount() {
		return peopleCount;
	}


	public void setPeopleCount(Integer peopleCount) {
		this.peopleCount = peopleCount;
	}


	public String getFeature1() {
		return feature1;
	}


	public void setFeature1(String feature1) {
		this.feature1 = feature1;
	}


	public String getFeature2() {
		return feature2;
	}


	public void setFeature2(String feature2) {
		this.feature2 = feature2;
	}


	public String getFeature3() {
		return feature3;
	}


	public void setFeature3(String feature3) {
		this.feature3 = feature3;
	}


	public String getRoomtype() {
		return roomtype;
	}


	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}


	public Hotel getHotel() {
		return hotel;
	}


	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}


	public List<HotelRoomImage> getHotelRoomImageList() {
		return hotelRoomImageList;
	}


	public void setHotelRoomImageList(List<HotelRoomImage> hotelRoomImageList) {
		this.hotelRoomImageList = hotelRoomImageList;
	}


}