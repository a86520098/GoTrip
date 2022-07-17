package com.ispan.group3.service.impl;

import com.ispan.group3.repository.HotelImage;
import com.ispan.group3.repository.HotelImageRepositoryInterFace;
import com.ispan.group3.service.HotelImagesService;
import org.springframework.beans.factory.annotation.Autowired;

public class HotelImagesServiceImpl implements HotelImagesService {

    private final HotelImageRepositoryInterFace hiRepository;

    @Autowired
    public HotelImagesServiceImpl(HotelImageRepositoryInterFace hiRepository) {
        this.hiRepository = hiRepository;
    }

    @Override
    public void save(HotelImage hotelImage) {

    }

    @Override
    public void deleteByid(Integer id) {

    }
}
