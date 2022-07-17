package com.ispan.group3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface HotelRepositoryInterFace extends JpaRepository<Hotel, Integer> {


    @Query(value = "SELECT * FROM hotel l WHERE l.company_id = ?1", nativeQuery = true)
    List<Hotel> findByCompany(Integer companyId);
}
