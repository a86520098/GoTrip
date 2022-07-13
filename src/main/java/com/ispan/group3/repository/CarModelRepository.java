package com.ispan.group3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CarModelRepository extends JpaRepository<CarModel, Integer>{

    @Query(value = "SELECT m.model FROM car_model m WHERE m.make_en = :make", nativeQuery = true)
    List<String> findAllModels(String make);
    
    @Query(value = "SELECT DISTINCT m.make_en FROM car_model m", nativeQuery = true)
    List<String> findAllMakes();
	
}
