package com.ispan.group3.service;

import java.util.List;

import com.ispan.group3.repository.Comment;
import com.ispan.group3.repository.CommentCount;


public interface CommentService {

	List<Comment> findAll();
	
	Comment findById(Integer id);

	void save(Comment comment);

	void deleteById(Integer id);
	
	List<CommentCount> findAllRatings();

	List<Comment> findByItem(String table, Integer id); 

}
