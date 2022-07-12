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
	public String findAll(Model model) {
		List<Comment> comments = cService.findAll();
		model.addAttribute("comments", comments);
		return "backend/comment-list";
	}
	
	@GetMapping({"/backend/comments/form"})
	public String showNewForm(Model model) {
		Comment comment = new Comment();			
		model.addAttribute("comment", comment);
		return "backend/comment-new-form";
	}

	@GetMapping({"/backend/comments/form/{id}"})
	public String showUpdateForm(Model model, @PathVariable(required = false) Integer id) {
		Comment comment;
		if (id != null) {
			comment = cService.findById(id);
		} else {
			comment = new Comment();			
		}
		model.addAttribute("comment", comment);
		return "backend/comment-form";
	}

	@PostMapping("/backend/comments")
	public String save(@ModelAttribute Comment comment, 
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
		cService.save(comment);

		return "redirect:/backend/comments";
	}

	@PutMapping("/backend/comments/{id}")
	public String updateComment(@ModelAttribute Comment comment,
							    @RequestParam(value = "imagefiles", required = false) List<MultipartFile> files,
							    @RequestParam(value = "deleteImages", required=false) List<String> deleteFiles) {
		Set<CommentImage> images = new HashSet<>();
		for (MultipartFile file : files) {
			try {
				String savePath = FileUploadUtil.saveFile("comment",file);
				CommentImage commentImage = new CommentImage(savePath, comment);
				images.add(commentImage);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		comment.setImages(images);
		cService.save(comment);
		
		return "redirect:/backend/comments";

	}

	@DeleteMapping("/backend/comments/{id}")
	public String deleteComment(@PathVariable Integer id) {
		cService.deleteById(id);
		return "redirect:/backend/comments";
	}
	

}
