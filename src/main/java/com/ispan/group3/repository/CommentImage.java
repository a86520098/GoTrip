package com.ispan.group3.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "comment_image")
public class CommentImage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "image_path")
	private String imagePath;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "comment_id")
	private Comment comment;

	public CommentImage() {
	}

	public CommentImage(Integer id, String imagePath, Comment comment) {
		this.id = id;
		this.imagePath = imagePath;
		this.comment = comment;
	}
	
	public CommentImage(String imagePath, Comment comment) {
		this.imagePath = imagePath;
		this.comment = comment;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public Comment getComment() {
		return comment;
	}
	public void setComment(Comment comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "CommentImage [id=" + id + 
				", imagePath=" + imagePath + 
				", comment=" + comment + 
				"]";
	}

	
	
	

	
	
	
	
	
}
