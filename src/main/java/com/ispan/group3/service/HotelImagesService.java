package com.ispan.group3.service;

import com.ispan.group3.repository.HotelImage;

public interface HotelImagesService {


    void save(HotelImage hotelImage);

    void deleteByid(Integer id);
    

}
