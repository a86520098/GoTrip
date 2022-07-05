package com.ispan.group3.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.ispan.group3.repository.Comment;
import com.ispan.group3.repository.CommentImage;
import com.ispan.group3.service.CommentService;
import com.ispan.group3.util.FileUploadUtil;

@Controller
//@RequestMapping(path = "/backend")
public class CommentController {

	private final CommentService cService;

	@Autowired
	public CommentController(CommentService cService) {
		this.cService = cService;
	}

	@GetMapping("/backend/comments")
	public String getComments(Model model) {
		List<Comment> comments = cService.getComments();
		model.addAttribute("comments", comments);
		return "backend/comment-list";
	}
	
	@GetMapping({"/backend/comments/form", "/backend/comments/form/{id}"})
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

	@GetMapping("/backend/comments/{id}")
	public Comment getComment(@PathVariable Integer id) {
		return cService.getComment(id);
	}

	@PostMapping("/backend/comments")
	public String insertComment(@ModelAttribute Comment comment, 
								@RequestParam(value = "imagefiles", required = false) List<MultipartFile> files,
								@RequestParam(value = "deleteImages", required = false) List<Integer> deleteImages) {
		Set<CommentImage> images = new HashSet<>();
		for (MultipartFile file : files) {
			try {
				String savePath = FileUploadUtil.saveFile("comment", file);
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
		return "redirect:/backend/comments/";
	}

	@PutMapping("/backend/comments/{id}")
	public String updateComment(@ModelAttribute Comment comment,
							    @RequestParam(value = "imagefiles", required = false) List<MultipartFile> files,
							    @RequestParam(value = "deleteImages", required=false) List<String> deleteFiles) {
		Set<CommentImage> images = new HashSet<>();
		for (MultipartFile file : files) {
			try {
				String savePath = FileUploadUtil.saveFile("comment", file);
				CommentImage commentImage = new CommentImage(savePath, comment);
				images.add(commentImage);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		comment.setImages(images);
		cService.updateComment(comment);
		
		return "redirect:/backend/comments/";

	}

	@DeleteMapping("/comments/{id}")
	public String deleteComment(@PathVariable Integer id) {
		cService.deleteComment(id);
		return "redirect:/backend/comments/";
	}
	
	@ModelAttribute
	public void setModel(Model model) {
		Integer[] scoreArray = {0,1,2,3,4,5};
		List<Integer> scoreList = new ArrayList<Integer>();
		Collections.addAll(scoreList, scoreArray);
		model.addAttribute("ratingScore", scoreList);

	}

}
