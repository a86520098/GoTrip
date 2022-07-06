package com.ispan.group3.service.impl;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ispan.group3.repository.Comment;
import com.ispan.group3.repository.CommentCount;
import com.ispan.group3.repository.CommentRepository;
import com.ispan.group3.service.CommentService;

//@Transactional
@Service
public class CommentServiceImpl implements CommentService{

	private final CommentRepository cRepository;

	@Autowired
	public CommentServiceImpl(CommentRepository cRepository) {
		this.cRepository = cRepository;
	}

	@Override
	public List<Comment> getComments() {
		return cRepository.findAll();
	}
	
	@Override
	public Comment getComment(Integer id) {
		return cRepository.findById(id).get();
	}

	@Override
	public void insertComment(Comment comment) {
		comment.setDate(new Timestamp(System.currentTimeMillis()));
		comment.setStatus("valid");
		if (comment.getRating() == null) 
			comment.setRating(5);
		cRepository.save(comment);
	}

	@Override
	public void updateComment(Comment comment) {
		cRepository.save(comment);
	}

	@Override
	public void deleteComment(Integer id) {
		boolean exists = cRepository.existsById(id);
		if (!exists) {
			throw new IllegalStateException("Comment with id " + id + " does not exist");
		}
		cRepository.deleteById(id);
	}

//	@Override
//	public Float getAvgRating(String itemTb, Integer itemId) {
//		return cRepository.getAvgRating(itemTb, itemId);
//	}
//
//	@Override
//	public Integer countByItem(String itemTb, Integer itemId) {
//		return cRepository.countByItem(itemTb, itemId);
//	}

	@Override
	public List<CommentCount> getRatings() {
		return cRepository.getRatings();
	}
	
	
}
