package com.ispan.group3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer>{

    @Query(value = "SELECT c.item_tb AS itemTb, c.item_id AS itemId, ROUND(AVG(CAST(c.rating AS FLOAT)), 1) AS avgRating, COUNT(*) AS count FROM comment c GROUP BY c.item_tb, c.item_id", nativeQuery = true)
    List<CommentCount> findAllRatings();


}
