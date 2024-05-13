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
@Table(name = "history_projects")
public class HistoryProject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_history_project")
	private Long idHistoryProject;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne
	@JoinColumn(name = "project_id")
	private Project project;

	public HistoryProject() {
	}

	public HistoryProject(User user, Project project) {
		this.user = user;
		this.project = project;
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

	public Long getIdHistoryProject() {
		return idHistoryProject;
	}

	@Override
	public String toString() {
		return "HistoryProject [idHistoryProject=" + idHistoryProject + ", user=" + user + ", project=" + project + "]";
	}

}
