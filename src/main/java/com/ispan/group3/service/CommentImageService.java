package com.ispan.group3.service;

import com.ispan.group3.repository.CommentImage;

public interface CommentImageService {

	void save(CommentImage commentImage);

	void deleteById(Integer id);

}
