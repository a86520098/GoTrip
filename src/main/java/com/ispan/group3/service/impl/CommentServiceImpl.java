package com.ispan.group3.service.impl;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ispan.group3.repository.Comment;
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
		cRepository.save(comment);
		
	}

	@Override
	public void updateComment(Integer id, Integer rating, String content) {
		Comment comment = cRepository.findById(id)
				.orElseThrow(() -> new IllegalStateException("Comment with id " + id + " does not exist"));
		if (rating != null && !Objects.equals(comment.getRating(), rating)) {
			comment.setRating(rating);
		}
		
		if (content != null && !Objects.equals(comment.getContent(), content)) {
			comment.setContent(content);
		}

	}

	@Override
	public void deleteComment(Integer id) {
		boolean exists = cRepository.existsById(id);
		if (!exists) {
			throw new IllegalStateException("Comment with id " + id + " does not exist");
		}
		cRepository.deleteById(id);
	}
	
	
}
