package com.ispan.group3.service.impl;

import com.ispan.group3.repository.HotelRoomImage;
import com.ispan.group3.repository.HotelRoomImageRepository;
import com.ispan.group3.service.HotelRoomImageService;
import org.springframework.beans.factory.annotation.Autowired;

public class HotelRoomImageServiceImpl implements HotelRoomImageService {
    @Autowired
    private HotelRoomImageRepository hotelRoomImageRepository;

    @Override
    public void save(HotelRoomImage hotelRoomImage) {
        hotelRoomImageRepository.save(hotelRoomImage);
    }

    @Override
    public void deleteByid(Integer id) {
        hotelRoomImageRepository.deleteById(id);
    }
}
