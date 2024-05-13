package com.app.myprotask.model;

import java.util.Date;

import java.util.List;

import com.app.myprotask.enums.StatusProject;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;


/**
 * It contains a user, a list of members, and a list of characteristics.
 * They come from the User and Characteristic entities.
 *
 * @author Manuel
 */
@Entity
@Table(name = "projects")
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_project")
	private Long idProject;

	@Column(name = "name", nullable = false, length = 100)
	private String name;

	@Column(name = "description", length = 500)
	private String description;

	@Column(name = "start_date")
	private Date startDate;

	@Column(name = "finish_date")
	private Date finishDate;

	@Max(value = 999, message = "La cantidad de vacantes no puede ser mayor que 999")
	@Column(name = "vacancies")
	private int vacancies;

	@Column(name = "status")
	@Enumerated(EnumType.STRING)
	private StatusProject status;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "manager_id")
	private User manager;

	@ManyToMany
	@JoinTable(name = "members", joinColumns = @JoinColumn(name = "project_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
	private List<User> members;

	@ManyToMany
	@JoinTable(name = "project_caracteristics", joinColumns = @JoinColumn(name = "project_id"), inverseJoinColumns = @JoinColumn(name = "caracteristic_id"))
	private List<Caracteristic> projectCaracteristics;

	public Project() {
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

	public int getVacancies() {
		return vacancies;
	}

	public void setVacancies(int vacancies) {
		this.vacancies = vacancies;
	}

	public StatusProject getStatus() {
		return status;
	}

	public void setStatus(StatusProject status) {
		this.status = status;
	}

	public User getManager() {
		return manager;
	}

	public void setManager(User manager) {
		this.manager = manager;
	}

	public List<User> getMembers() {
		return members;
	}

	public void setMembers(List<User> members) {
		this.members = members;
	}

	public List<Caracteristic> getProjectCaracteristics() {
		return projectCaracteristics;
	}

	public void setProjectCaracteristics(List<Caracteristic> projectCaracteristics) {
		this.projectCaracteristics = projectCaracteristics;
	}

	public Long getIdProject() {
		return idProject;
	}

	public Project(String name, String description, Date startDate, Date finishDate,
			@Max(value = 999, message = "La cantidad de vacantes no puede ser mayor que 999") int vacancies,
			StatusProject status, User manager, List<User> members, List<Caracteristic> projectCaracteristics) {
		this.name = name;
		this.description = description;
		this.startDate = startDate;
		this.finishDate = finishDate;
		this.vacancies = vacancies;
		this.status = status;
		this.manager = manager;
		this.members = members;
		this.projectCaracteristics = projectCaracteristics;
	}

	@Override
	public String toString() {
		return "Project [idProject=" + idProject + ", name=" + name + ", description=" + description + ", startDate="
				+ startDate + ", finishDate=" + finishDate + ", vacancies=" + vacancies + ", manager=" + manager
				+ ", members=" + members + ", projectCaracteristics=" + projectCaracteristics + "]";
	}

}
