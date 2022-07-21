package com.ispan.group3.repository;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "HotelRoomImage")
@Component
public class HotelRoomImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String imagePath;
    @ManyToOne
    @JoinColumn(name = "hotelroom_id")
    @JsonIgnore
    private HotelRoom hotelRoom;

    private Timestamp admissionTime;

    public HotelRoomImage() {
    }

    public HotelRoomImage(String imagePath, HotelRoom hotelRoom) {
        this.imagePath = imagePath;
        this.hotelRoom = hotelRoom;
    }
}
