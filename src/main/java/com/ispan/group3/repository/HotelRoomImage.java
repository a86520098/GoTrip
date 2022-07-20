package com.ispan.group3.repository;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@Table(name = "HotelRoomImage")
@Component
public class HotelRoomImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "imagePath")
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
