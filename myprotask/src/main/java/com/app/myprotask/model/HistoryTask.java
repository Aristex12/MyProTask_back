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
@Table(name = "history_tasks")
public class HistoryTask {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_history_task")
	private Long idHistoryTask;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne
	@JoinColumn(name = "task_id")
	private Task task;

	public HistoryTask() {
	}

	public HistoryTask(User user, Task task) {
		this.user = user;
		this.task = task;
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

	public Long getIdHistoryTask() {
		return idHistoryTask;
	}

	@Override
	public String toString() {
		return "HistoryTask [idHistoryTask=" + idHistoryTask + ", user=" + user + ", task=" + task + "]";
	}

}
