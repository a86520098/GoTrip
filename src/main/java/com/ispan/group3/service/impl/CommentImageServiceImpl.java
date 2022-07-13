package com.ispan.group3.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ispan.group3.repository.CommentImage;
import com.ispan.group3.repository.CommentImageRepository;
import com.ispan.group3.service.CommentImageService;

@Service
public class CommentImageServiceImpl implements CommentImageService {
	
	private final CommentImageRepository ciRepository;

	@Autowired
	public CommentImageServiceImpl(CommentImageRepository ciRepository) {
		this.ciRepository = ciRepository;
	}
	


	@Override
	public void insertImage(CommentImage commentImage) {
		ciRepository.save(commentImage);
	}

	@Override
	public void deleteImage(Integer id) {
		boolean exists = ciRepository.existsById(id);
		if (!exists) {
			throw new IllegalStateException("Image of comment with id " + id + " does not exist");
		}
		ciRepository.deleteById(id);
	}


}
