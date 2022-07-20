package com.ispan.group3.service.impl;


import com.ispan.group3.repository.HotelRoom;
import com.ispan.group3.repository.HotelRoomRepositoryInterFace;
import com.ispan.group3.service.HotelRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelRoomServiceImpl implements HotelRoomService {
    private HotelRoomRepositoryInterFace hotelRoomRepository;


    @Autowired
    public HotelRoomServiceImpl(HotelRoomRepositoryInterFace hotelRoomRepository) {
        this.hotelRoomRepository = hotelRoomRepository;
    }


    @Override
    public List<HotelRoom> findAll() {
        return hotelRoomRepository.findAll();
    }

    @Override
    public HotelRoom findByid(Integer id) {
        return hotelRoomRepository.findById(id).get();
    }

    @Override
    public void save(HotelRoom hotelRoom) {
        hotelRoomRepository.save(hotelRoom);
    }

    @Override
    public void deleteById(Integer id) {
        if (!hotelRoomRepository.existsById(id))
            throw new IllegalStateException("Hotel room with id" + id + "does not exust");
        hotelRoomRepository.deleteById(id);
    }

    @Override
    public Long count() {
        return hotelRoomRepository.count();
    }

    @Override
    public List<HotelRoom> findAllHotelRoom(Integer hotelID) {
        return hotelRoomRepository.findAllHotelRoom(hotelID);
    }


}



