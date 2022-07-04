package com.ispan.group3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentImageRepository extends JpaRepository<CommentImage, Integer>{

	@Query( value = "SELECT * FROM comment_image WHERE comment_id = ?1", nativeQuery=true)
	List<CommentImage> findByComment(Integer commentId);



}
