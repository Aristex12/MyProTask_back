package com.app.myprotask.model;

import java.time.LocalDate;
import java.sql.Date;

import com.app.myprotask.model.enums.PriorityTasks;

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
 * Contains a project and contains participants who will work on the task.
 * 
 * @author Alejandro
 */
@Entity
@Table(name = "tasks")
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_task")
	private Long idTask;

	@Column(name = "name", nullable = false, length = 100)
	private String name;

	@Column(name = "description", nullable = false, length = 500)
	private String description;

	@Column(name = "start_date")
	private Date startDate;

	@Column(name = "finish_date", nullable = false)
	private Date finishDate;

	@Column(name = "is_active")
	private boolean isActive;

	@Column(name = "priority", nullable = false)
	@Enumerated(EnumType.STRING)
	private PriorityTasks priority;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "project_id")
	private Project project;

	public Task() {
	}

	public Task(String name, String description, Date finishDate, PriorityTasks priority,
			Project project) {
		this.name = name;
		this.description = description;
		this.startDate = generateLocalDate();
		this.finishDate = finishDate;
		this.isActive = true;
		this.priority = priority;
		this.project = project;
	}

	/**
	 * @author Manuel
	 * @return the current date
	 */
	private Date generateLocalDate() {
		return Date.valueOf(LocalDate.now());
	}

	public Long getIdTask() {
		return idTask;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public PriorityTasks getPriority() {
		return priority;
	}

	public void setPriority(PriorityTasks priority) {
		this.priority = priority;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "Task [idTask=" + idTask + ", name=" + name + ", description=" + description + ", startDate=" + startDate
				+ ", finishDate=" + finishDate + ", isActive=" + isActive + ", priority=" + priority + ", project="
				+ project + "]";
	}

}