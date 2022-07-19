package com.ispan.group3.service;

import com.ispan.group3.repository.HotelRoomImage;

public interface HotelRoomImageService {


    void save(HotelRoomImage hotelRoomImage);

    void deleteByid(Integer id);
}
