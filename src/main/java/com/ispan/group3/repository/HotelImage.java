package com.ispan.group3.repository;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "HotelImage")
public class HotelImage {


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


    public HotelImage() {
    }

    public HotelImage(String imagePath, Hotel hotel) {
        this.imagePath = imagePath;
        this.hotel = hotel;
    }
}


