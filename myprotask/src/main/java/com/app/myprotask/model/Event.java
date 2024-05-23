package com.app.myprotask.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * Contains all the events from one specific user
 *
 * @author Alejandro
 */
@Entity
@Table(name = "events")
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_event")
	private Long idEvent;

	@Column(name = "title", nullable = false, length = 200)
	private String title;

	@Column(name = "description", length = 500)
	private String description;

	@Column(name = "finish_date", nullable = false)
	private Date finishDate;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public Event() {
	}

	public Event(String title, String description, Date finishDate, User user) {
		this.title = title;
		this.description = description;
		this.finishDate = finishDate;
		this.user = user;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Long getIdEvent() {
		return idEvent;
	}

	@Override
	public String toString() {
		return "Event [idEvent=" + idEvent + ", title=" + title + ", description=" + description + ", finishDate="
				+ finishDate + ", user=" + user + "]";
	}

}
