package com.ispan.group3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ispan.group3.repository.Comment;
import com.ispan.group3.repository.CommentCount;
import com.ispan.group3.service.CommentService;

@RestController
@RequestMapping(path = "/api")
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
	
	@PostMapping
	public void insertComment(@RequestBody Comment comment) {
		cService.save(comment);
	}
	
//	@PutMapping("/comments/{id}")
//	public void updateComment(@PathVariable Integer id,
//							  @RequestParam(required = false) Integer rating,
//							  @RequestParam(required = false) String content) {
//		cService.updateComment(id, rating, content);
//	}
	
	@DeleteMapping("/comments/{id}")
	public void deleteComment(@PathVariable Integer id) {
		cService.deleteById(id);
	}
	
	@GetMapping("/comments/ratings")
	public List<CommentCount> findAllRatings() {
	    return cService.findAllRatings();
	}


}
