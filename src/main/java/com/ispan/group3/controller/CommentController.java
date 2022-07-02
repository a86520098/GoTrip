package com.ispan.group3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ispan.group3.repository.Comment;
import com.ispan.group3.service.CommentService;

@Controller
@RequestMapping(path = "comments")
public class CommentController {

//	private final CommentService cService;

//	@Autowired
//	public CommentController(CommentService cService) {
//		this.cService = cService;
//	}

	@GetMapping("/hello")
	public String hello() {
		return "test";
	}

	@GetMapping("/")
	public String getComments() {
//	public String getComments(Model model) {
//		List<Comment> comments = cService.getComments();
//		model.addAttribute("comments", comments);
		return "backend/comment-list";
	}
	
//	@GetMapping({"/form", "/form/{id}"})
//	public String showNewForm(Model model, @PathVariable(required = false) Integer id) {
//		Comment comment;
//		if (id != null) {
////			comment = cService.getComment(id);
//		} else {
//			comment = new Comment();			
//		}
//		model.addAttribute("comment", comment);
//		return "backend/comment-form";
//	}
//
//	@GetMapping("/{id}")
//	public Comment getComment(@PathVariable Integer id) {
//		return cService.getComment(id);
//	}
//
//	@PostMapping
//	public String insertComment(@ModelAttribute Comment comment, Model model) {
//		comment.setItemTb("hotel");
//		cService.insertComment(comment);
//		return "redirect:/comments/";
//	}

//	@PutMapping("/{id}")
//	public void updateComment(@ModelAttribute Comment comment, @PathVariable Integer id, @RequestParam(required = false) Integer rating,
//			@RequestParam(required = false) String content) {
//		cService.updateComment(id, rating, content);
//	}

//	@DeleteMapping("/{id}")
//	public String deleteComment(@PathVariable Integer id) {
//		cService.deleteComment(id);
//		return "redirect:/comments/";
//	}

}
