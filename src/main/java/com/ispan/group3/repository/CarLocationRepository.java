package com.ispan.group3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CarLocationRepository extends JpaRepository<CarLocation, Integer>{

    @Query(value = "SELECT * FROM car_location l WHERE l.company_id = ?1", nativeQuery = true)
    List<CarLocation> findByCompany(Integer companyId);
	
}
