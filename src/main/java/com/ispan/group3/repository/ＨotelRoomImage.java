package com.ispan.group3.repository;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

public class ＨotelRoomImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "imagePath")
    private String imagePath;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hotel_id")
    @JsonIgnore
    private Hotel hotel;


    @Column(name = "fileName")
    private String fileName; //接檔案名稱
    @CreationTimestamp
    @Column(name = "admissionTime")
    private Timestamp admissionTime; //街道檔案的那時候時間


}





