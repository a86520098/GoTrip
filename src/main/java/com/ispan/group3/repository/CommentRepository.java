package com.ispan.group3.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer>{

//    @Query( value = "SELECT ROUND(AVG(CAST(rating AS FLOAT)), 1) FROM comment WHERE item_tb = ?1 AND item_id = ?2", 
//    		nativeQuery=true)
//    Float getAvgRating(String itemTb, Integer itemId);
//
//    @Query( value = "SELECT COUNT(*) FROM comment WHERE item_tb = ?1 AND item_id = ?2", 
//    		nativeQuery = true)
//	Integer countByItem(String itemTb, Integer itemId);
	
    @Query(value = "SELECT c.item_tb AS itemTb, c.item_id AS itemId, ROUND(AVG(CAST(c.rating AS FLOAT)), 1) AS avgRating, COUNT(*) AS count FROM comment c GROUP BY c.item_tb, c.item_id", nativeQuery = true)
    List<CommentCount> getRatings();


}
