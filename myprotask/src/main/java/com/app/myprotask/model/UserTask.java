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
@Table(name = "user_tasks")
public class UserTask {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_user_task")
	private Long idUserProject;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne
	@JoinColumn(name = "task_id")
	private Task task;

	@Column(name = "is_active")
	private boolean isActive;

	public UserTask() {
	}

	public UserTask(User user, Task task) {
		this.user = user;
		this.task = task;
		this.isActive = true;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Long getIdUserProject() {
		return idUserProject;
	}

	@Override
	public String toString() {
		return "UserTask [idUserProject=" + idUserProject + ", user=" + user + ", task=" + task + ", isActive="
				+ isActive + "]";
	}

}
