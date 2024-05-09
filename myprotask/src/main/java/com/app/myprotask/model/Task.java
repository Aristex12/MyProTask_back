package com.app.myprotask.model;
import java.util.Date;
import java.util.List;

import com.app.myprotask.enums.PriorityTasks;
import com.app.myprotask.enums.StatusTasks;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
 
/**
 * Contains a project and contains participants who
 * will work on the task. 
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
 
	@Column(name = "description", length = 100)
	private String description;
 
	@Column(name = "start_date")
	private Date startDate;
 
	@Column(name = "finish_date")
	private Date finishDate;
 
	@Column(name = "status")
	private StatusTasks status;
	
	@Column(name = "priority")
	private PriorityTasks priority;
 
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "project_id")
	private Project project;
 
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "participants", joinColumns = @JoinColumn(name = "task_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
	private List<User> participants;
 
	public Task() {
	}

	public Task(String name, String description, Date startDate, Date finishDate, StatusTasks status,
			PriorityTasks priority, Project project, List<User> participants) {
		this.name = name;
		this.description = description;
		this.startDate = startDate;
		this.finishDate = finishDate;
		this.status = status;
		this.priority = priority;
		this.project = project;
		this.participants = participants;
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

	public StatusTasks getStatus() {
		return status;
	}

	public void setStatus(StatusTasks status) {
		this.status = status;
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

	public List<User> getParticipants() {
		return participants;
	}

	public void setParticipants(List<User> participants) {
		this.participants = participants;
	}

	@Override
	public String toString() {
		return "Task [idTask=" + idTask + ", name=" + name + ", description=" + description + ", startDate=" + startDate
				+ ", finishDate=" + finishDate + ", status=" + status + ", priority=" + priority + ", project="
				+ project + ", participants=" + participants + "]";
	}
 
}
