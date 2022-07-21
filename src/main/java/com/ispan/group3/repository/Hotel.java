package com.ispan.group3.repository;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.sql.Blob;
import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "Hotel")
@Component("Hotel")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;  //自動生成
    private Integer companyId; //連接會員id作用
    private String status;  //是專業經理 Or 自由業者
    private String hotelStyle;   // 公寓 & 整間小屋  & 整棟住宅 & 別墅 & 專業大飯店
    private Integer hotelArea;  // 接受使用者  住宿大小坪數
    private Integer bathCount;  // 衛浴數量
    private Integer bedroomCount;  //房間數量
    private Integer bedCount;   //床的數量
    private String fullAddress;  //完整地址
    private String notional;  //國家
    private String city;   //城市
    private String hotelRule;  //住宿規則
    @Column(length = 2000)
    private String Howgoto;   //顧客該如何去
    private String hotel_name;  // 住宿的Name
    @Column(length = 2000)
    private String introduce;   //介紹你的hotel
    private String provide;    // checkbox 多值
    private Integer phone;     //聯絡的電話
    private Integer price;     ////一晚的價格
    private String boss_name;   //聯絡人名子
    private String roomtype;    //單人房  Or  雙人房 or Both
    private Integer peopleCount;  //可住人數
    private String feature1;// 特色1
    private String feature2;// 特色1
    private String feature3;// 特色1
    @JsonIgnore
    private Blob image;   //之後接受照片的容器
    private String fileName; //接檔案名稱
    @CreationTimestamp
    private Timestamp admissionTime; //街道檔案的那時候時間
    @Transient
    @JsonIgnore
    private MultipartFile productImage;//前端照片
    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL) //   表示被維護端
    private List<HotelImage> images;
    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL) //表示被維護端
    private List<HotelRoom> hotelroomList;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
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
	public List<HotelImage> getImages() {
		return images;
	}
	public void setImages(List<HotelImage> images) {
		this.images = images;
	}
	public List<HotelRoom> getHotelroomList() {
		return hotelroomList;
	}
	public void setHotelroomList(List<HotelRoom> hotelroomList) {
		this.hotelroomList = hotelroomList;
	}
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
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
	public List<HotelImage> getImages() {
		return images;
	}
	public void setImages(List<HotelImage> images) {
		this.images = images;
	}
	public List<HotelRoom> getHotelroomList() {
		return hotelroomList;
	}
	public void setHotelroomList(List<HotelRoom> hotelroomList) {
		this.hotelroomList = hotelroomList;
	}

    	

}