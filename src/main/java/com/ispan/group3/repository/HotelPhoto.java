package com.ispan.group3.repository;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.sql.Blob;
import java.sql.Timestamp;
@Getter
@Setter
@Entity
@Table(name = "hotelPhoto")
@Component("HotelPhoto")
public class HotelPhoto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String image1;   //之後接受照片的容器


    private  String fileName; //接檔案名稱
    @CreationTimestamp
    private Timestamp admissionTime; //街道檔案的那時候時間
    @Transient
    private MultipartFile productImage;
}
