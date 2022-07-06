package com.ispan.group3.service;

import java.util.List;
import java.util.Map;

import com.ispan.group3.repository.Comment;
import com.ispan.group3.repository.CommentCount;


public interface CommentService {

	List<Comment> getComments();
	
	Comment getComment(Integer id);

	void insertComment(Comment comment);

	void updateComment(Comment comment);

	void deleteComment(Integer id);

//	Float getAvgRating(String itemTb, Integer itemId);
//
//	Integer countByItem(String itemTb, Integer itemId);
	
	List<CommentCount> getRatings(); 

}
