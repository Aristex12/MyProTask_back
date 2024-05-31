package com.app.myprotask.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * Contains the project that the user requests
 * 
 * @author Laura
 */
@Entity
@Table(name = "requests")
public class Request {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_request")
	private Long idRequest;

	@Column(name = "message", length = 200)
	private String message;

	@Column(name = "is_accepted")
	private boolean isAccepted;

	@ManyToOne
	@JoinColumn(name = "project_id")
	private Project project;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public Request() {
	}

	public Request(String message, User user, Project project) {
		this.message = message;
		this.isAccepted = false;
		this.user = user;
		this.project = project;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isAccepted() {
		return isAccepted;
	}

	public void setAccepted(boolean isAccepted) {
		this.isAccepted = isAccepted;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Long getIdRequest() {
		return idRequest;
	}

	@Override
	public String toString() {
		return "Request [idRequest=" + idRequest + ", message=" + message + ", isAccepted=" + isAccepted + ", user="
				+ user + ", project=" + project + "]";
	}

}
