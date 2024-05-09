package com.app.myprotask.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
 
@Entity
@Table(name = "requests")
public class Request {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_request")
	private Long idRequest;
 
	@Column(name = "message")
	private String message;
	
	@Column(name = "status")
	private String status;
 
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
 
	@ManyToOne
	@JoinColumn(name = "project_id")
	private Project project;
 
	public Request() {
	}

	public Request(String message, String status, User user, Project project) {
		this.message = message;
		this.status = status;
		this.user = user;
		this.project = project;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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
		return "Request [idRequest=" + idRequest + ", message=" + message + ", status=" + status + ", user=" + user
				+ ", project=" + project + "]";
	}
 
}
