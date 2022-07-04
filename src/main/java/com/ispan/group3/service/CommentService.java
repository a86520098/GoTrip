package com.ispan.group3.service;

import java.util.List;

import com.ispan.group3.repository.Comment;


public interface CommentService {

	List<Comment> getComments();
	
	Comment getComment(Integer id);

	void insertComment(Comment comment);

	void updateComment(Integer id, Integer rating, String content);

	void deleteComment(Integer id);

	float getAvgRating(String itemTb, Integer itemId);

	int countByItem(String itemTb, Integer itemId);

}
