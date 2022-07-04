package com.ispan.group3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer>{

    @Query( value = "SELECT ROUND(AVG(CAST(rating AS FLOAT)), 1) FROM comment WHERE item_tb = ?1 AND item_id = ?2", 
    		nativeQuery=true)
    float getAvgRating(String itemTb, Integer itemId);

    @Query( value = "SELECT COUNT(*) FROM comment WHERE item_tb = ?1 AND item_id = ?2", 
    		nativeQuery=true)
	int countByItem(String itemTb, Integer itemId);


}
