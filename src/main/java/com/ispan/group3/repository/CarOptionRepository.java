package com.ispan.group3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarOptionRepository extends JpaRepository<CarOption, Integer>{
    
}
