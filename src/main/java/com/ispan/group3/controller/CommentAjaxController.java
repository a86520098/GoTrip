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
	public List<Comment> getComments() {
		return cService.getComments();
	}
	
	@GetMapping("/comments/{id}")
	public Comment getComment(@PathVariable Integer id) {
		return cService.getComment(id);
	}
	
	@PostMapping
	public void insertComment(@RequestBody Comment comment) {
		cService.insertComment(comment);
	}
	
//	@PutMapping("/comments/{id}")
//	public void updateComment(@PathVariable Integer id,
//							  @RequestParam(required = false) Integer rating,
//							  @RequestParam(required = false) String content) {
//		cService.updateComment(id, rating, content);
//	}
	
	@DeleteMapping("/comments/{id}")
	public void deleteComment(@PathVariable Integer id) {
		cService.deleteComment(id);
	}
	
	// 針對某商品平均分數、評論數量
//	@GetMapping("/comments/rating")
//	public Map<String, String> getAvgRating(@RequestParam String itemTb, @RequestParam Integer itemId) {
//	    Map<String, String> map = new HashMap<String, String>();
//	    Float avgRating = cService.getAvgRating(itemTb, itemId);
//	    Integer count = cService.countByItem(itemTb, itemId);
//	    map.put("itemTb", itemTb);
//	    map.put("itemId", String.valueOf(itemId));
//	    map.put("avgRating", String.valueOf(avgRating));
//	    map.put("count", String.valueOf(count));
//	    return map;
//	}
	
	@GetMapping("/comments/ratings")
	public List<CommentCount> getAvgRating() {
	    return cService.getRatings();
	}


}
