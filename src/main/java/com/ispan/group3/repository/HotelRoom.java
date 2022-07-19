package com.ispan.group3.repository;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;

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

    public HotelRoom() {
    }
}