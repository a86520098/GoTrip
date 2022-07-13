package com.ispan.group3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarOptionRepository extends JpaRepository<CarOption, Integer>{
//
//    @Query(value = "SELECT * FROM car_option o WHERE location_id = ?1", nativeQuery = true)
//    List<CarOption> findByLocId(Integer locationId);
    
}
