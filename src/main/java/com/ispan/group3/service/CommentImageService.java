package com.ispan.group3.service;

import java.util.List;

import com.ispan.group3.repository.CommentImage;

public interface CommentImageService {

	List<CommentImage> getImages(Integer commentId);

	void insertImage(CommentImage commentImage);

	void deleteImage(Integer id);

}
