package com.ispan.group3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface HotelRoomRepositoryInterFace extends JpaRepository<HotelRoom, Integer> {

    @Query(value = "SELECT * FROM hotel_room l WHERE l.hotel_id = ?1", nativeQuery = true)
    List<HotelRoom> findAllHotelRoom(Integer hotelID);
}
