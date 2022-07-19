package com.ispan.group3.service.impl;

import java.sql.Timestamp;
import java.util.List;

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
	public List<Comment> findAll() {
		return cRepository.findAll();
	}
	
	@Override
	public Comment findById(Integer id) {
		return cRepository.findById(id).get();
	}

	@Override
	public void save(Comment comment) {
		if (comment.getDate() == null) {
			comment.setDate(new Timestamp(System.currentTimeMillis()));			
		}
		if (comment.getRating() == null) {
			comment.setRating(5);			
		}
		if (comment.getStatus() == null) {
			comment.setStatus("valid");		
		}
		cRepository.save(comment);
	}

	@Override
	public void deleteById(Integer id) {
		boolean exists = cRepository.existsById(id);
		if (!exists) {
			throw new IllegalStateException("Comment with id " + id + " does not exist");
		}
		cRepository.deleteById(id);
	}

	@Override
	public List<CommentCount> findAllRatings() {
		return cRepository.findAllRatings();
	}

	@Override
	public List<Comment> findByItem(String table, Integer id) {
		return cRepository.findByItem(table, id);
	}
	
	
}
