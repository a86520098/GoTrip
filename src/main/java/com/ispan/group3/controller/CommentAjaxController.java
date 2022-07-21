package com.ispan.group3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ispan.group3.repository.Comment;
import com.ispan.group3.repository.CommentCount;
import com.ispan.group3.repository.CommentImage;
import com.ispan.group3.service.CommentService;

@RequestMapping(path = "/api")
@RestController
public class CommentAjaxController {

	private final CommentService cService;
	
	@Autowired
	public CommentAjaxController(CommentService cService) {
		this.cService = cService;
	}

	@GetMapping("/comments")
	public List<Comment> findAll() {
		return cService.findAll();
	}
	
	@GetMapping("/comments/{id}")
	public Comment findById(@PathVariable Integer id) {
		return cService.findById(id);
	}
	
	@GetMapping("/comments/item")
	public List<Comment> findByItem(@RequestParam String table, @RequestParam Integer id) {
		return cService.findByItem(table, id);
	}
	
	@PostMapping("/comments")
	public Boolean save(@RequestBody Comment comment) {
		List<CommentImage> images = comment.getImages();
		for (CommentImage image: images) {
			image.setComment(cService.findById(251));
		}
		comment.setImages(images);
		cService.save(comment);
		return true;
	}
	
	@DeleteMapping("/comments/{id}")
	public void deleteById(@PathVariable Integer id) {
		cService.deleteById(id);
	}
	
	@GetMapping("/comments/ratings")
	public List<CommentCount> findAllRatings() {
	    return cService.findAllRatings();
	}


}
