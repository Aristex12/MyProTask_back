package com.app.myprotask.model;
import com.app.myprotask.enums.StatusRequests;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
	
	@Column(name = "status" )
	@Enumerated(EnumType.STRING)
	private StatusRequests status;
 
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User user;
 
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "project_id")
	private Project project;
 
	public Request() {
	}


	public Request(String message, StatusRequests status, User user, Project project) {
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


	public StatusRequests getStatus() {
		return status;
	}


	public void setStatus(StatusRequests status) {
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
