package com.ispan.group3.controller;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.ispan.group3.repository.Comment;
import com.ispan.group3.repository.CommentImage;
import com.ispan.group3.service.CommentImageService;
import com.ispan.group3.service.CommentService;
import com.ispan.group3.util.FileUploadUtil;

@Controller
//@RequestMapping(path = "comments")
public class CommentController {

	private final CommentService cService;
	private final CommentImageService ciService;

	@Autowired
	public CommentController(CommentService cService, CommentImageService ciService) {
		this.cService = cService;
		this.ciService = ciService;
	}

	@GetMapping("/hello")
	public String hello() {
		return "test";
	}

	@GetMapping("/comments")
	public String getComments(Model model) {
		List<Comment> comments = cService.getComments();
		model.addAttribute("comments", comments);
		return "backend/comment-list";
	}
	
	@GetMapping({"/comments/form", "/comments/form/{id}"})
	public String showNewForm(Model model, @PathVariable(required = false) Integer id) {
		Comment comment;
		if (id != null) {
			comment = cService.getComment(id);
		} else {
			comment = new Comment();			
		}
		model.addAttribute("comment", comment);
		return "backend/comment-form";
	}

	@GetMapping("/comments/{id}")
	public Comment getComment(@PathVariable Integer id) {
		return cService.getComment(id);
	}

	@PostMapping("/comments")
	public String insertComment(@ModelAttribute Comment comment, @RequestParam("images") List<MultipartFile> files) {

		String saveDir = "comment";
		Set<CommentImage> images = new HashSet<>();
		for (MultipartFile file : files) {
			try {
				String savePath = FileUploadUtil.saveFile(saveDir, file);
				CommentImage commentImage = new CommentImage(savePath, comment);
				images.add(commentImage);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		comment.setImages(images);
		cService.insertComment(comment);
		
//		cService.insertComment(comment);
//		String saveDir = "comment";
//		for (MultipartFile file : files) {
//			try {
//				String savePath = FileUploadUtil.saveFile(saveDir, file);
//				CommentImage commentImage = new CommentImage(savePath, comment);
//				ciService.insertImage(commentImage);
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		return "redirect:/comments/";
	}

	@PutMapping("/comments/{id}")
	public void updateComment(@ModelAttribute Comment comment, @PathVariable Integer id, 
							  @RequestParam(required = false) Integer rating,
							  @RequestParam(required = false) String content) {
		cService.updateComment(id, rating, content);
	}

	@DeleteMapping("/comments/{id}")
	public String deleteComment(@PathVariable Integer id) {
		cService.deleteComment(id);
		return "redirect:/comments/";
	}

}
