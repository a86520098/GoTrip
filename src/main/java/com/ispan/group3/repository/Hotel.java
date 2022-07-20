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

	


}