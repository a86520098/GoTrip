//package com.ispan.group3.repository;
//
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import lombok.Getter;
//import lombok.Setter;
//import org.springframework.stereotype.Component;
//
//import javax.persistence.*;
//
//@Entity
//@Getter
//@Setter
//@Table(name = " HotelRoom")
//@Component("HotelRoom")
//public class HotelRoom {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//    private String roomname;
//    private String roomprice;
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "hotelid")
//    @JsonIgnore
//    private HotelRoom Hotel;
//
//
//}
