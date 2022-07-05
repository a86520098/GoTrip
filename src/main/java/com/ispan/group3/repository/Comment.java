package com.ispan.group3.repository;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "comment")
public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "item_tb")
	private String itemTb;
	@Column(name = "item_id")
	private Integer itemId;
	@Column(name = "user_id")
	private String userId;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
	private Timestamp date;
	private Integer rating;
	private String content;
	private String status;
	@OneToMany(mappedBy="comment", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<CommentImage> images;
	
	
	public Comment() {
		
	}
	
	public Comment(Integer id, String itemTb, Integer itemId, String userId, Timestamp date, Integer rating,
			String content, String status, Set<CommentImage> images) {
		this.id = id;
		this.itemTb = itemTb;
		this.itemId = itemId;
		this.userId = userId;
		this.date = date;
		this.rating = rating;
		this.content = content;
		this.status = status;
		this.images = images;
	}

	public Comment(String itemTb, Integer itemId, String userId, Timestamp date, Integer rating, String content,
			 String status, Set<CommentImage> images) {
		this.itemTb = itemTb;
		this.itemId = itemId;
		this.userId = userId;
		this.date = date;
		this.rating = rating;
		this.content = content;
		this.status = status;
		this.images = images;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getItemTb() {
		return itemTb;
	}

	public void setItemTb(String itemTb) {
		this.itemTb = itemTb;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Set<String> getImages() {
		Set<String> imagePaths = new LinkedHashSet<>();
		for (CommentImage image : images) {
			imagePaths.add(image.getImagePath());
		}
		return imagePaths;
	}
	
//	public Map<Integer, String> getImages() {
//		Map<Integer, String> imagePaths = new HashMap<>();
//		for (CommentImage image : images) {
//			imagePaths.put(image.getId(), image.getImagePath());
//		}
//		return imagePaths;
//	}

	public void setImages(Set<CommentImage> images) {
		this.images = images;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + 
				", itemTb=" + itemTb + 
				", itemId=" + itemId + 
				", userId=" + userId + 
				", date=" + date + 
				", rating=" + rating + 
				", content=" + content + 
				", status=" + status + 
				"]";
	}

	
	
}
