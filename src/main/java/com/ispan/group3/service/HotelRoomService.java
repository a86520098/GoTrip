package com.ispan.group3.service;

import com.ispan.group3.repository.HotelRoom;

import java.util.List;

public interface HotelRoomService {


    List<HotelRoom> findAll();

    HotelRoom findByid(Integer id);

    void save(HotelRoom hotelRoom);

    void deleteById(Integer id);

    Long count();
}
