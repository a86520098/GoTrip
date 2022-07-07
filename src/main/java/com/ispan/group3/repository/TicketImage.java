package com.ispan.group3.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Ticket_image")
public class TicketImage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "image_path")
	private String imagePath;

	@ManyToOne
	@JoinColumn(name = "ticket_no1")
	private Ticket ticket;

	public TicketImage() {
	}

	public TicketImage(Long id, String imagePath, Ticket Ticket) {
		this.id = id;
		this.imagePath = imagePath;
		this.ticket = Ticket;
	}
	
	public TicketImage(String imagePath, Ticket Ticket) {
		this.imagePath = imagePath;
		this.ticket = Ticket;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket Ticket) {
		this.ticket = Ticket;
	}

	@Override
	public String toString() {
		return "TicketImage [id=" + id + 
				", imagePath=" + imagePath + 
				", Ticket=" + ticket + 
				"]";
	}
}