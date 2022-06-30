package com.ispan.group3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ispan.group3.repository.Comment;
import com.ispan.group3.service.CommentService;

@Controller
@RequestMapping(path = "comments")
public class CommentController {

	private final CommentService cService;

	@Autowired
	public CommentController(CommentService cService) {
		this.cService = cService;
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "test";
	}

	@GetMapping("/list")
	public String getComments(Model model) {
		List<Comment> comments = cService.getComments();
		model.addAttribute("comments", comments);
		return "backend/comment-list";
	}

	@GetMapping(path = "/{id}")
	public Comment getComment(@PathVariable Integer id) {
		return cService.getComment(id);
	}

	@PostMapping("/insert")
	public void insertComment(@RequestBody Comment comment) {
		cService.insertComment(comment);
	}

	@PutMapping(path = "/{id}")
	public void updateComment(@PathVariable Integer id, @RequestParam(required = false) Integer rating,
			@RequestParam(required = false) String content) {
		cService.updateComment(id, rating, content);
	}

	@DeleteMapping(path = "/{id}")
	public void deleteComment(@PathVariable Integer id) {
		cService.deleteComment(id);
	}

}
